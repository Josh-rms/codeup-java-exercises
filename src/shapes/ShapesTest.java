package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable square = (Measurable) new Square(5);
        Measurable rectangle = (Measurable) new Rectangle(5,4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
