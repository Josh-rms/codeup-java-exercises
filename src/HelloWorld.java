public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string!";
        System.out.println(myString);
        myString = "This is the new string!";
        System.out.println(myString);
//        myString = 3.14159;
//        System.out.println(myString);

        //To fix this you can change float to double or use casting
//        float myNumber = 3.14;
//        System.out.println(myNumber);


        //This prints out 5 & 6 because its post incrementing.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
        //This prints out 6 & 6 because its pre incrementing.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //I think it should just print out the variable stored in the object, that being "three"
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //This code block is different from the one above because it's initializing the variable as a integer unlike the top which was a string
        //Error 1. You calling a String an integer.
        //Error 2. You're trying to cast an integer into a string into an integer.
//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
    }
}
