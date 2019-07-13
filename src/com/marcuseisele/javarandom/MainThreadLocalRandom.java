package com.marcuseisele.javarandom;

import java.util.concurrent.ThreadLocalRandom;

public class MainThreadLocalRandom {

    public static void main(String[] args) {
        //Initialize the random object
        ThreadLocalRandom current = ThreadLocalRandom.current();

        //Generate numbers between 0 and 100
        int firstRandomValue = current.nextInt(101);
        int secondRandomValue = current.nextInt(101);

        //Print the generated random values
        System.out.println("First int: " + firstRandomValue);
        System.out.println("Second int: " + secondRandomValue);

        //Generate double random values (values are between 0 (inclusive) and 1.0 (exclusive))
        double firstRandomDouble = current.nextDouble();
        double secondRandomDouble = current.nextDouble();

        //Print the generated random values
        System.out.println("First double: " + firstRandomDouble);
        System.out.println("Second double: " + secondRandomDouble);
    }
}
