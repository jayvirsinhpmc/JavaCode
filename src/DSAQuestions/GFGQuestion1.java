package DSAQuestions;

/*
Question
Given an array Arr of N elements and a integer K.
Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.
*/
public class GFGQuestion1 {
    public int search(int arr[], int n, int k) {
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        GFGQuestion1 g1 = new GFGQuestion1();
        int arr[] = {1,98,35,89,68};
        int len = arr.length;
        int num = 35;
        int result = g1.search(arr, len, num);
        if(result != -1){
            System.out.println("index: " + result);
        } else {
            System.out.println("element not found");
        }
    }
}
