package ArrayArrayList;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,4,52,5};
//        swap(arr,3,4);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverseArray(int[] arr){

        int start = 0, end = arr.length-1;
        while (start< end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
