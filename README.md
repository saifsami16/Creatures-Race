# Creatures-Race
There is a race for creatures, which takes place on several consecutive days. Who wins the race? (In other words, which creature can go farthest and remain live?)At the beginning, each creature has an amount of water, and a distance of 0 from the start. There are three different kind days could occur:
sunny, cloudy, rainy. The movement and the water level of a creature are affected by the type of the day and the creature. At first, a creature changes its water level according to the day, and if it is still alive, it moves. A creature dies if it runs out of water (water level drops to 0 or below). A dead creature doesn’t
move...
Properties of creatures: name of the creature (string), water level (integer), maximum water level
(integer), living (Boolean), distance (integer).
The types of creatures on the race are: sandrunner, sponge, walker. Creatures cannot have water more than their maximum water level. Read the data of the race from a text file. The first line of the file contains the number of competitors (let's say N). Each of the following N lines contains a competitor: name, type,
initial water level. The properties are separated by spaces; and the type is represented with one character:
r - sandrunner, s - sponge, w - walker. The last line of the file contains the type of the days on the race: s - sunny, c - cloudy, r - rainy.
The program should ask for the name of the file, and it has to print out the name of the winner (we can assume that the file is existing and its format is valid).
