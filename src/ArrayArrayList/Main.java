package ArrayArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // syntax
        // datatype[] variableName = new datatype[size];
        int[] roll1 = new int[5];
        int[] roll2 = {25, 24, 52, 245, 5};

        // best way to print the array

        System.out.println(Arrays.toString(roll1));
        System.out.println(Arrays.toString(roll2));

        // object array
        String[] str = new String[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
