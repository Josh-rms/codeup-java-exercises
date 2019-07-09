package shapes;

public abstract class Quadrilateral extends Shape {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
        this.numSides=4;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);
    public abstract void setWidth(int width);

    public double getPerimeter() {
        return (2*this.length)+(2*this.width);
    }

    public double getArea() {
        return this.length*this.width;
    }
}
