package com.marcuseisele.javarandom;

public class MainMathRandom {

    public static void main(String[] args) {
        //Generate random numbers between 0.0 (inclusive) and 1.0 (exclusive)
        double firstRandomValue = Math.random();
        double secondRandomValue = Math.random();

        //Print the generated random values
        System.out.println("First randomValue: " + firstRandomValue);
        System.out.println("Second randomValue: " + secondRandomValue);
    }
}
