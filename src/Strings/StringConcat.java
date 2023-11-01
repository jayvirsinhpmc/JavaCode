package Strings;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "hello";
        String newStr = str + " world";
        String numStr = str + 12;
        String charStr = str + 'j';
        System.out.println(str);
        System.out.println(newStr);
        System.out.println(charStr);
        System.out.println(numStr);
    }
}
