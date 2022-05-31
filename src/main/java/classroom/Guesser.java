package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {

    public static void main(String[] args) {

        // Program generate number from 1 to 10
        // User enter no 1 to 10
        // If value is not in range, write error and start again
        // If value is not same as generated, stop the program!

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Please enter number:");
            int answer = scanner.nextInt();
            if (answer < 1 || answer > 10) {
                System.out.println("Number is not correct, try again!");
            } else if (answer == randomNumber) {
                System.out.println("Number is guessed! Number: " + answer);
                isGuessed = true;
            } else {
                System.out.println("Number is not guessed! Try again");
            }
        }
    }
}
