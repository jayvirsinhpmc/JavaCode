package BasicsOfJava;

public class JavaOperators {
    public static void main(String[] args) {
//        arithmatic operators

        int a = 10;
        int b = 20;

        System.out.println("arithmatic operators");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println();

//        unary operators

        int c = 30;

        System.out.println("unary operators");
        System.out.println("c++ = " + c++);
        System.out.println("++c = " + ++c);
        System.out.println("c-- = " + c--);
        System.out.println("--c = " + --c);
        System.out.println();

//        assignment operators

        int d = 100;

        System.out.println("assignment operators");
        System.out.println("d += 300: " + (d += 300));
        System.out.println("d -= 200: " + (d -= 200));
        System.out.println("d *= 400: " + (d *= 400));
        System.out.println("d /= 1000: " + (d /= 1000));
        System.out.println("d %= 200: " + (d %= 200));
        System.out.println();

//        relational operators

        int l = 25;
        int g = 50;

        System.out.println("relational operators");
        System.out.println("l == g: " + (l == g));
        System.out.println("l != g: " + (l != g));
        System.out.println("l > g: " + (l > g));
        System.out.println("l >= g: " + (l >= g));
        System.out.println("l < g: " + (l < g));
        System.out.println("l <= g: " + (l <= g));
        System.out.println();

//        logical operators

        boolean t = true;
        boolean f = false;

        System.out.println("logical operators");
        System.out.println("f && t: " + (f && t));
        System.out.println("f || t: " + (f || t));
        System.out.println("!f: " + (!f));
        System.out.println();

//        ternary operators

        System.out.println("ternary operators");
        int result = (a > b ? a : b);
        System.out.println("result = " + result);
        System.out.println("");

//        instanceof operators

        System.out.println("instanceof operators");

        Shape myShape = new Shape();
        Shape myCircle = new Circle();

        System.out.println("myShape is instanceof Shape: " + (myShape instanceof Shape));
        System.out.println("myShape is instanceof Circle: " + (myShape instanceof Circle));
        System.out.println("myShape is instanceof MyInterface: " + (myShape instanceof MyInterface));
        System.out.println("myCircle is instanceof shape: " + (myCircle instanceof Shape));
        System.out.println("myShape is instanceof Circle: " + (myCircle instanceof Circle));
        System.out.println("myShape is instanceof MyInterface: " + (myCircle instanceof MyInterface));
        System.out.println("");

    }
}

class Shape {

}
class Circle extends Shape implements MyInterface {

}

interface MyInterface {

}
