package JavaFlowControl;

public class ForEachLoop {
    public static void main(String[] args) {
        int age[] = {12,13,1,5,32,26};
        int maximumAge = calculateMaxAge(age);
        System.out.println("maximum age: " + maximumAge);
    }

    public static int calculateMaxAge(int[] num) {
        int max = num[0];

        for(int i : num) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
