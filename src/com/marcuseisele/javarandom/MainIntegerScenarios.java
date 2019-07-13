package com.marcuseisele.javarandom;

import java.util.Random;

public class MainIntegerScenarios {

    public static void main(String[] args) {
        //Initialize the random object
        Random random = new Random();

        //Generate numbers between 0 and 9 (0 <= X < 10)
        int zeroToTenExclusive = random.nextInt(10);
        System.out.println("zeroToTenExclusive: " + zeroToTenExclusive);

        //Generate numbers between 0 and 10 (0 <= X <= 10)
        int zeroToTenInclusive = random.nextInt(11);
        System.out.println("zeroToTenInclusive: " + zeroToTenInclusive);

        //Generate numbers between 0 (exclusive) and 10 (exclusive)
        int zeroToTenBothExclusive = random.nextInt(9) + 1;
        System.out.println("zeroToTenBothExclusive: " + zeroToTenBothExclusive);

        //Random Integer between Range not starting from 0
        int randomIntegerRange = getRandomIntegerWithinRange(10, 20);
        System.out.println("randomIntegerRange: " + randomIntegerRange);

    }

    private static int getRandomIntegerWithinRange(int min, int max) {
        int spread = max - min;
        return new Random().nextInt(spread + 1) + min;
    }
}
