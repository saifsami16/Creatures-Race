package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        Database db = new Database();
        db.readFile(in.nextLine());
        db.report();
    }
}
