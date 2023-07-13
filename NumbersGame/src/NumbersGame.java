import java.util.Random;
import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
            System.out.println("*********************************************************");
            System.out.println("Can you guess the number?");
            System.out.println("If you are not up to the task, you can always type 'q' to quit.");

            int answer = new Random().nextInt(11);
            int attempts = 0;
            boolean correctGuess = false;

            while (attempts < 3) {
                String guess = scanner.nextLine();

                if (guess.equals("q")) {
                    System.out.println("I knew you didn't have it in you.");
                    System.out.println("Shutting down...");
                    return;
                }

                try {
                    int number = Integer.parseInt(guess);
                    if (number < 0 || number > 10) {
                        System.out.println("Invalid guess! Guess a number between 0 and 10.");
                        continue;
                    }
                    if (number == answer) {
                        System.out.println("Lucky guess! But can you do it again?");
                        correctGuess = true;
                        break;
                    } else {
                        System.out.println("Swing and a miss! Keep trying...");
                        attempts++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number or 'q' to quit.");
                }
            }

            if (!correctGuess) {
                System.out.println("You failed! The correct answer was " + answer + ".");
            }

            System.out.println("Game over.");
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainAnswer = scanner.nextLine().toLowerCase();
            playAgain = playAgainAnswer.equals("yes");
        }

        System.out.println("Shutting down...");
    }
}