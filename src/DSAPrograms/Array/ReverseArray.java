package DSAPrograms.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int len = arr.length;
        int temp[] = new int[len];
        int n = len;

        for (int i = 0; i < len; i++) {
            temp[n-1] = arr[i];
            n--;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
