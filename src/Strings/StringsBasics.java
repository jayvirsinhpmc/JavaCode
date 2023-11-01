package Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String str = sc.next(); // takes only first word
//        String str = sc.nextLine(); // takes whole line
//        System.out.println(str.length()); // gives length of string(count every character and white spaces)
//        System.out.println(str.charAt(2)); // return the character at given index
//        System.out.println(str.indexOf('a')); // return the index of first occurance of given char

//        String str = "hello jay";
//        String gtr = "hello may";
//        System.out.println(str.compareTo(gtr));
        // return 0 when both strings are same,
        // return +ve integer when str > gtr in lexographic order,
        // return -ve integer when str < gtr in lexographic order

//        String str = "hello";
//        System.out.println(str.contains("llo"));
//        System.out.println(str.startsWith("He"));
//        System.out.println(str.endsWith("lo"));

//        String name = "Jay chhaSatiya";
//        System.out.println(name);
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        String str1 = "hello";
        String str2 = "world";

        System.out.println(str1.concat(str2));
        System.out.println(str1.concat(str1));

    }
}
