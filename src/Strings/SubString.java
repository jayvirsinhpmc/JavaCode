package Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
//        String name = "jayvirsinh chhasatiya";
//        System.out.println(name.substring(6)); // starts with
//        System.out.println(name.substring(0,3)); // staring index and ending - 1 index

//        print all possible substrings of a given string
//        String str = "abcd";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
}
