abstract class Figure {

    int l, b;

    Figure(int a, int b) {
        this.l = a;
        this.b = b;
    }

    abstract public void areaOfFigure();

    public void displayResult() {
    };
}

class Rectangle extends Figure {
    Rectangle(int l, int b) {
        super(l, b);
    }

    private int area;

    public void areaOfFigure() {

        area = l * b;
    }

    public void displayResult() {
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Figure {
    Square(int l) {
        super(l, 0);
    }

    private int area;

    public void areaOfFigure() {
        area = l * l;
    }

    public void displayResult() {
        System.out.println("Area of Square: " + area);
    }
}

class Circle extends Figure {

    Circle(int l) {
        super(l, 0);
    }

    private double area;

    public void areaOfFigure() {
        area = 3.14 * l * l;
    }

    public void displayResult() {
        System.out.println("Area of Circle: " + area);
    }
}

public class abstractClassAreas {

    public static void main(String args[]) {
        Rectangle f1 = new Rectangle(3, 4);
        Square f2 = new Square(5);
        Circle f3 = new Circle(7);

        f1.areaOfFigure();
        f1.displayResult();

        f2.areaOfFigure();
        f2.displayResult();

        f3.areaOfFigure();
        f3.displayResult();
    }

}
