package Leetcode;

public class NumberOfGoodPairs {
    public int numberOfPairs(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        NumberOfGoodPairs pairs = new NumberOfGoodPairs();
        int[] arr = {1,3,2,1,3,2,5};
        int sol = pairs.numberOfPairs(arr);
        System.out.println(sol);
    }
}
