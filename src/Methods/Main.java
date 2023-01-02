package Methods;

import java.util.Scanner;

public class Main{

    // access modifier, static, return type, name(arguments){}
    public static int sum(int n1, int n2){
        int sum = n1+ n2;
        return sum;
//        System.out.println("This will never be executed");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("first num? ");
        int n1= in.nextInt();
        System.out.println("Second num? ");
        int n2= in.nextInt();
        System.out.println("Sum of n1 and n2 is "+sum(n1,n2));
    }
}

