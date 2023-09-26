package ArraySearching;

public class LinearSearch {

    public int searchNum(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] array = {2,81,6,45,68,48};
        int num = 6;
        int result = ls.searchNum(array, num);
        if(result != -1) {
            System.out.println("index: " + result);
        } else {
            System.out.println("element not found");
        }
    }
}
