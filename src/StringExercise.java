import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input:");
        String message1 = "We don't need no education";
        String userInput = sc.nextLine();
        if (userInput.equals(message1)) {
            System.out.println("We don't need no thought control");
        } else if (userInput.equals("Check \"this\" out!,")) {
            System.out.println("\"s inside of \"s!");
        } else if (userInput.equals("In windows, the main drive is usually")) {
            System.out.println("C:\\");
        } else if (userInput.equals("I can do backslashes, double backslashes and the amazing triple backslash!")) {
            System.out.println("\\, \\\\, \\\\\\");
        }

        // Lecture example

        String phrase1 = "We don't need no education\nWe don't need no thought control";
        System.out.println(phrase1);

        String phrase2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(phrase2);

        String phrase3 = "In windows, the main drive is usually C:\\";
        System.out.println(phrase3);

        String phrase4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(phrase4);
    }
}
