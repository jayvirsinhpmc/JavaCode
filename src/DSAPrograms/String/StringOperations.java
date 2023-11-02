package DSAPrograms.String;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";

        // Concatenation
        String result = str1 + str2;
        System.out.println("Concatenated String: " + result);

        // Length of the string
        int length = result.length();
        System.out.println("Length of the String: " + length);

        // Substring
        String substring = result.substring(0, 5);
        System.out.println("Substring: " + substring);

        // IndexOf
        int index = result.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // Character access
        char firstChar = result.charAt(0);
        char lastChar = result.charAt(result.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Uppercase and lowercase
        String upperCase = result.toUpperCase();
        String lowerCase = result.toLowerCase();
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);

        // Replace
        String replaced = result.replace("World", "Universe");
        System.out.println("After Replacement: " + replaced);

        // Split
        String[] words = result.split(", ");
        System.out.print("Split result: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Checking for equality
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);
    }
}

