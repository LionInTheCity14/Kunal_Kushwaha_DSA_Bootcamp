package Methods;

public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        // swap
//        int temp = a;
//        a= b;
//        b= temp;

        swap(a,b);
        System.out.println(a+" "+b);

        String name= "Varun";
        changename(name);

    }

     static void changename(String name) {
        name = "Sahil";
    }

    static void swap(int a, int b){
        int temp= a;
        a= b;
        b= temp;
    }

}
