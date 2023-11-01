package JavaOOP.Polymorphism;


class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

//    Method Overloading
    void draw(String color) {
        System.out.println("Drawing a shape with color " + color);
    }
}

class Circle extends Shape {

//    Method Overriding
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        shape.draw();
        shape.draw("red");

        circle.draw();
        circle.draw("blue");
    }
}