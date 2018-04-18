package com.subha.test;

import java.util.Scanner;

/**
 * Created by subhanjan on 16/04/2018.
 */
public class Main {
    public static void main(String[] args) {
        int lowerBound, upperBound, divisor;

        try (Scanner reader = new Scanner(System.in)) {


            System.out.println("Enter a lower index number: ");
            while (!reader.hasNextInt()) {
                String input = reader.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
            }
            lowerBound = reader.nextInt();

            System.out.println("Enter a higher index number: ");
            while (!reader.hasNextInt()) {
                String input = reader.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
            }
            upperBound = reader.nextInt();

            System.out.println("Enter the divisor number: ");
            while (!reader.hasNextInt() ){
                String input = reader.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
            }
            divisor = reader.nextInt();

        }
        Solution sol = new Solution();
        System.out.println(sol.countDivisible(lowerBound, upperBound, divisor));
    }

}
