package main;

import java.util.Random;

public class RandomHelper {

    static Random random = new Random();

    //Returns true 9 times out of 10
    public static boolean getBigChance() {
        //random.nextDouble() returns a value between 0.0 and 0.1
        double chance = random.nextDouble();
        if (chance<0.9) {
            return true;
        } else {
            return false;
        }
    }

    //Returns true 5 times out of 10
    public static boolean get50Chance() {
        double chance = random.nextDouble();
        if (chance<=0.5) {
            return true;
        } else {
            return false;
        }
    }

    //Returns int between lower and upper (inklusive)
    public static int getInt(int lower, int upper) {
        return random.nextInt(( upper - lower) + 1 ) + lower;
    }
}