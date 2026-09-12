package edu.psu.se411;

import edu.psu.se411.exceptions.InvalidAgeException;
import edu.psu.se411.exceptions.InsufficientFundsException;

public class App {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: Age must be 18 or older.");
        } else {
            System.out.println("Age valid.");
        }
    }

    public static void main(String[] args) {

        // Exercise 1
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        // Exercise 2
        Wallet wallet = new Wallet(500);

        try {
            wallet.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}