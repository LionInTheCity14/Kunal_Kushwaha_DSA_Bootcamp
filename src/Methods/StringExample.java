package Methods;

public class StringExample {
   // private static String myGreet;

    static String greet(){

        String greeting= "How are you";
        return greeting;
    }

    public static void main(String[] args) {
        System.out.println(greet());

        String personalised = myGreet("Varun Pal Singh");
        System.out.println(personalised);

    }

     static String myGreet(String name) {
        String message = "Hello "+name;
        return message;
    }
}
