package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the ROCK PAPER SCISSORRS Tournament!");
        int userChoice, computerChoice, rock, paper, scissors;

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();

        rock = 0;
        paper = 1;
        scissors = 2;
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        userChoice = input.nextInt();
        computerChoice = rnd.nextInt(3);
        if (computerChoice == rock) {
            System.out.println("Computer chose ROCK");
        } else {
            if (computerChoice == paper) {
                System.out.println("Computer chose PAPER");
            } else {
                System.out.println("Computer chose SCISSORS");
            }
        }
        if (computerChoice == rock) {
            if (userChoice == paper) {
                System.out.println("User wins!");

            } else {
                System.out.println("Computer Wins");
            }
        } else if (computerChoice == paper) {
            if (userChoice == rock) {
                System.out.println("Computer wins");
            } else {
                System.out.println("User Wins!");
            }
        } else if (userChoice == rock) {
            System.out.println("User Wins");
        } else {
            System.out.println("Computer Wins");
        } if (userChoice == computerChoice) {
        System.out.println("Draw, try again!");
    }

    }
}