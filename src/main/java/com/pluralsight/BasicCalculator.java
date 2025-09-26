package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();

        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option:");

        char operator = scanner.next().charAt(0);

        if (operator == 'A') {
            float result = num1 + num2;
            float roundedResult = Math.round(result * 100) / 100.0f;
            System.out.printf("%.2f + %.2f | Result: %.2f", num1, num2, roundedResult);
        } else if (operator == 'S') {
            float result = num1 - num2;
            System.out.printf("%.2f - %.2f | Result: %.2f", num1, num2, result);
        } else if (operator == 'M') {
            float result = num1 * num2;
            System.out.printf("%.2f * %.2f | Result: %.2f", num1, num2, result);
        } else if (operator == 'D') {
            if (num2 == 0) {
                System.out.println("Not divisible - 0");
            } else {
                float result = num1 / num2;
                System.out.printf("%.2f / %.2f | Result: %.2f", num1, num2, result);
            }

        } else {
            System.out.println("You have entered unknown option");
        }

    }
}
