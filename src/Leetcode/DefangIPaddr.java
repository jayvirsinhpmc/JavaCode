package Leetcode;

public class DefangIPaddr {

    public String solution (String addr) {
        return addr.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangIPaddr defangIPaddr = new DefangIPaddr();
        String newString = defangIPaddr.solution("255.255.255.255");
        System.out.println(newString);
    }
}
