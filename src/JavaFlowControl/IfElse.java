package JavaFlowControl;

public class IfElse {
    public static void main(String[] args) {

        int age = 19;

        if (age < 18) {
            System.out.println("You are not eligible for voting");
        } else if (age == 18) {
            System.out.println("You will eligible next year");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
}
