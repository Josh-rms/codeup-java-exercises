import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        System.out.println("Enter a integer.");
        int integer = sc.nextInt();

        System.out.println("Enter 3 words.");
        String word1 = sc.next();
        System.out.println(word1);
        String word2 = sc.next();
        System.out.println(word2);
        String word3 = sc.next();
        System.out.println(word3);

        System.out.println("Enter a sentence.");
        String sentence1 = sc.next();
        System.out.println(sentence1);

        System.out.println("Enter the length, and width of this classroom.");
        System.out.print("Length (ft): ");
        double length = Float.parseFloat(sc.next());
        System.out.print("Width (ft): ");
        double width = Float.parseFloat(sc.next());

        System.out.printf("The area of the classroom is %.2f ft^2.%n", length * width);
        System.out.printf("The perimeter of the classroom is %.2fft.%n", (length * 2) + (width * 2));
    }
}
