package module_5.exceptions.task5;

import org.w3c.dom.ranges.RangeException;

import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       GuessNumber guessNumber = new GuessNumber();
       int numberToGuess = new Random().nextInt(100);
        int yourNumber;
        do {
            yourNumber = guessNumber.getInputNumber();
            if (yourNumber > numberToGuess) {
                System.out.println("Your number is bigger than hidden one");
            } if (yourNumber < numberToGuess) {
                System.out.println("Your number is less than hidden one");
            }
       } while (yourNumber != numberToGuess);
        System.out.println("YOU GUESSED!!! The number was: " + numberToGuess);
    }

    int getInputNumber() {
        int inputNumber = Integer.MIN_VALUE;
        boolean isValid = false;
        do {
            System.out.println("Input your number [0-100]:");
            try {
                inputNumber = Integer.parseInt(scanner.nextLine());
                if (inputNumber < 0 || inputNumber > 100) {
                    throw new Exception("Input number must be between 0 and 100 including");
                }
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Your input was not a valid integer [0-100]");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isValid);
        return inputNumber;
    }
}
