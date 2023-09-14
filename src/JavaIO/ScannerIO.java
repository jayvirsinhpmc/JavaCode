package JavaIO;

import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter mobile no. : ");
        long mobileNo = sc.nextLong();

        System.out.println("User's Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No.: " + mobileNo);

    }
}
