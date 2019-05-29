import java.util.Scanner;
import java.util.Random;
public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int myNum = rand.nextInt(100) + 1;
        String userResponse;
        System.out.println("Would you like to guess a number from 1-100?(yes/no)");
        userResponse = sc.next();
        boolean found = false;
        int guesses = 0;
        while(!found) {
            System.out.println("What number am I thinking of?");
            int userGuess = sc.nextInt();
            guesses++;
            if(userGuess < myNum) {
                System.out.println("HIGHER!");
            }
            if(userGuess > myNum) {
                System.out.println("LOWER!");
            }
            if(userGuess == myNum) {
                System.out.println("GOOD GUESS!! You got it after " + guesses + " guesses!");
                found = true;
            }
        }
    }
}