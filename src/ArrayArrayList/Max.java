package ArrayArrayList;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 34, 53, 65, 367, 3214, 982};
        System.out.println(max(arr));
    }
    // imagine that arr is not empty
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max)
                max = arr[i];
        }
        return max;
    }
}
