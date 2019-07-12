package com.marcuseisele.javarandom;

import java.util.Random;

public class MainRandom {

    public static void main(String[] args) {
        //Initialize the random object
        Random random = new Random();

        //Generate numbers between 0 and 100
        int firstRandomValue = random.nextInt(101);
        int secondRandomValue = random.nextInt(101);

        //Print the generated random values
        System.out.println("First int: " + firstRandomValue);
        System.out.println("Second int: " + secondRandomValue);


        //Generate double random values (values are between 0 (inclusive) and 1.0 (exclusive))
        double firstRandomDouble = random.nextDouble();
        double secondRandomDouble = random.nextDouble();

        //Print the generated random values
        System.out.println("First double: " + firstRandomDouble);
        System.out.println("Second double: " + secondRandomDouble);
    }
}
