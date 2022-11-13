public class Triangle extends Shape {

    private double side1 = 1.0;

    private double side2 = 1.0;

    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
            return (side1 * side2) / 2;
        } else {
            return Math.sqrt((getPerimeter()/2) * ((getPerimeter()/2) - side1) * ((getPerimeter()/2) - side2) * ((getPerimeter()/2) - side3));
        }
    }

    @Override
    public String toString() {
        if (Math.abs(side2 -side3) < side1 && side1 < side2 + side3) {
            return "A triangle with side 1 = " + getSide1() + ", side 2 = " + getSide2() + ", side 3 = " + getSide3() + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", which is a subclass of " + super.toString();

        } else {
            return "This triangle does not exist";
        }
    }
}
