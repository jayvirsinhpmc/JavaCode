package JavaFlowControl;

public class WhileLoop {
    public static void main(String[] args) {

//        sample code for demonstration of the working of the while loop
//        int i = 1;
//        while(i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        this while loop print sum of numbers from 1 to 10
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
