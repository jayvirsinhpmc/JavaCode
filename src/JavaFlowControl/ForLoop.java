package JavaFlowControl;

public class ForLoop {
    public static void main(String[] args) {
//        int sum = 0;

//        this for loop print sum of numbers from 1 to 10
//        for (int i = 0; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum: " + sum);

//        enhanced for loop
        String nameArray[] = {"jay", "vir", "jayvir", "man"};
        for (String name: nameArray) {
            System.out.println(name);
        }
    }
}
