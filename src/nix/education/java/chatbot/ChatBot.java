package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("""
                Hello! My name is Aboba.
                I was created in 2021.
                Please, remind me your name.""");

        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.next();
        System.out.println("What a great name you have, " + yourName + "!");

        System.out.println("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.""");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + " !");
        }

        System.out.println("""
                Let's test your programming knowledge.
                Why do we use methods?
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.""");
        int answer;
        while (true) {
            answer = scanner.nextInt();
            if (answer == 2) {
                System.out.println("""
                        Great, you right!
                        Goodbye, have a nice day!""");
                break;
            } else {
                System.out.println("Please,try again.");
            }
        }
    }
}

