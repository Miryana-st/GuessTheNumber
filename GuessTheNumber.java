import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GuessTheNumber {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);

        int numComputer = randomNumber.nextInt(1, 100);
        boolean isValid = true;

        while (true) {
            System.out.println("Guess a number from 1 to 100");
            String personsGuess = scanner.nextLine();

            for (int i = 0; i < personsGuess.length(); i++) {
                if (personsGuess.charAt(i) < 48 || personsGuess.charAt(i) > 57) {
                    isValid = false;
                }
            }
            if (isValid) {
                int personsGuessNumber = Integer.parseInt(personsGuess);
                if (personsGuessNumber < numComputer) {
                    System.out.println("Too Low");
                } else if (personsGuessNumber > numComputer) {
                    System.out.println("Too High");
                } else {
                    System.out.println("You Guessed It!");
                    break;
                }
            } else {
                System.out.println("Invalid Number");
                isValid = true;
            }
        }
    }
}