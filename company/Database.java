package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.exit;

public class Database {
    LinkedList<Creature> creatures = new LinkedList<>();

    public void readFile(String file){
        try {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            int countCreatures = myReader.nextInt();
            String name, kind;
            int water;
            if(countCreatures == 0){
                System.out.println("Not enough creatures to start the race");
                exit(1);
            }
            Creature tempCreature = null;
            for(int i=0; i<countCreatures; i++) {
                name = myReader.next();
                kind = myReader.next();
                water = myReader.nextInt();
                switch (kind) {
                    case "r":
                        tempCreature = new Sandrunner(name, water);
                        break;
                    case "s":
                        tempCreature = new Sponge(name, water);
                        break;
                    case "w":
                        tempCreature = new Walker(name, water);
                        break;
                    default:
                        System.out.println("Error in reading names of runners");
                }
                creatures.add(tempCreature);
            }

            String days = myReader.next();
            for(int i=0; i < days.length(); i++){
                for(Creature cr:creatures){
                    if(cr.isAlive()){      //the dead do not run
                        switch(days.charAt(i)){
                            case 's':
                                cr.sunny();
                                break;
                            case 'c':
                                cr.cloudy();
                                break;
                            case 'r':
                                cr.rainy();
                                break;
                            default:
                                System.out.println("Error in reading days from file");
                        }
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            exit(1);
        }
    }

    public void report(){
        int max = -1;
        ArrayList<String> winners = new ArrayList<String>();
        for(Creature c : creatures){
            if(c.isAlive() && c.getDistance()>max){
                max = c.getDistance();
                winners.clear();
                winners.add(c.getName());
            }
            else if(c.isAlive() && c.getDistance()==max)winners.add(c.getName());
        }
        if(max == -1) System.out.println("No runner could survive the race");
        else{
            System.out.println("Max distance covered is: "+max+"\nAnd the winners are:");
            for(String w:winners){
                System.out.println(": "+w);
            }
        }
    }
}