import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessIt {
    private static final int Min = 0;
    private static final int Max = 100;

    public static void main(String[] args) {
        GuessIt play = new GuessIt();
        play.startGame();
    }

    public void startGame() {
        boolean UserGuessCorrect = false;
        int guessNumberCount = 0;
        int randomNumber = getNumber();

        while (!UserGuessCorrect) {
            int userNumber = getUserGuess();
            if (userNumber > randomNumber) {
                System.out.println("Sorry, the number you guessed is too high :(");
            } else if (userNumber < randomNumber) {
                System.out.println("Sorry, the number you guessed is too low :(");
            } else {
                System.out.println("Congratulations! Your guess is correct :)");
                UserGuessCorrect = true;
            }
            guessNumberCount++;
        }
        System.out.println("You found the number in " + guessNumberCount + " guesses..... Well Done!");
    }

    public int getNumber() {
        return ThreadLocalRandom.current().nextInt(Min, Max + 1);
    }

    public int getUserGuess() {
        Scanner line = new Scanner(System.in);
        System.out.println("Please guess the number: ");
        return line.nextInt();
    }
}