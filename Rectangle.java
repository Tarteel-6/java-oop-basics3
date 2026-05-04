public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Length: " + length +
                "\nWidth: " + width +
                "\nArea: " + calculateArea() +
                "\nPerimeter: " + calculatePerimeter();
    }
}

