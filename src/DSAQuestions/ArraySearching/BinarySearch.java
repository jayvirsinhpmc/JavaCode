package DSAQuestions.ArraySearching;

public class BinarySearch {

    public int binarySearch(int[] arr, int num){
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;

        while (low <= high) {
//            check if the number is present at the mid
            if(arr[mid] == num){
                return mid;
            }
//            check if the number is smaller or equal to mid then ignore right half of the array
            if (arr[mid] <= num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        int[] arr = {1,2,3,4,5,31,13,54};
        int num = 4;

        int result = bs.binarySearch(arr, num);
        if(result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at: " + result);
        }
    }

}
