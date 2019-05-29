import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition());
        System.out.println(Subtraction());
        System.out.println(Multiplication());
        System.out.println(Division());
        int userInput = getInteger(1, 10);
        System.out.println(userInput);

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to continue?(yes/no)");
        String response = sc.nextLine();
        if (response.equals("yes")) {
        System.out.println(userInput + "! = " + factorial(userInput));
    }
        do{
            System.out.println("Would you like to roll the dice?(yes/no)");
            response = sc.next();
            if(response.equals("yes")) {
                System.out.println("How many dice?");
                int diceCount = sc.nextInt();
                System.out.println("Enter the number of sides on your dice: ");
                int sidesOfDice = sc.nextInt();
                int diceRoll[] = rollDice(diceCount, sidesOfDice);
                for (int i = 0; i < diceRoll.length; i++){
                    System.out.println("Dice #" + (i + 1) + " rolled a " + diceRoll[i] + ".");
                }
            }
        } while(response.equals("yes"));
    }
    public static int Addition() {
        return (1 + 1);
    }
    public static int Subtraction() {
        return (2 - 1);
    }
    public static int Multiplication() {
        return (2 * 2);
    }
    public static int Division() {
        return (4 / 2);
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int inputNumber = sc.nextInt();
        if(inputNumber > max || inputNumber < min){
            inputNumber = getInteger(min, max);
        }
        return inputNumber;
    }
    private static long factorial(int x){
        if (x == 0)
            return 1;
        return x * factorial(--x);
    }
    private static int[] rollDice(int dieCount, int sides){
        int dieResults[] = new int[dieCount];
        Random rand = new Random();
        for(int i = 0; i < dieCount; i++){
            dieResults[i] = rand.nextInt(sides)+1;
        }
        return dieResults;
    }
}