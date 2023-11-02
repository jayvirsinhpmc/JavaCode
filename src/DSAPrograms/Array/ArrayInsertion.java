package DSAPrograms.Array;

import java.util.Arrays;

public class ArrayInsertion {

//    insert element at starting
    public int[] insertAtStarting(int[] arr, int num){
        int len = arr.length;
        int[] result = new int[len+1];

        result[0] = num;

        for (int i = 0; i < len; i++) {
            result[i+1] = arr[i];
        }

        return result;
    }

//    insert element at particular possition
    public int[] insertAtParticularPossition(int[] arr, int position, int num){
        int len = arr.length;
        int[] result = new int[len+1];
        for (int i = 0, j = 0; i <= len; i++) {
            if(i == position){
                result[i] = num;
            } else {
                result[i] = arr[j++];
            }
        }
        return result;
    }

//    insert element at end
    public int[] insertAtEnding(int[] arr, int num){
        int len = arr.length;
        int[] result = new int[len+1];

        result[len] = num;
        for (int i = 0; i < len; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {

        ArrayInsertion ai = new ArrayInsertion();
        int[] originalArray = {1,2,3,5,6,7};

        int[] newArray1 = ai.insertAtStarting(originalArray, 50);
        int[] newArray2 = ai.insertAtParticularPossition(originalArray, 3, 50);
        int[] newArray3 = ai.insertAtEnding(originalArray, 50);


        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));
        System.out.println(Arrays.toString(newArray3));
    }
}
