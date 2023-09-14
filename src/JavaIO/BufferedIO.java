package JavaIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedIO {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Hello, " + name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
