package JavaOperators;

public class Operators {
    public static void main(String[] args) {

//        arithmatic operators
        int a = 55;
        int b = 23;

        System.out.println("arithmatic operators");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println();

//        unary operators
        int c = 10;

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
        int l = 100;
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
    }
}
