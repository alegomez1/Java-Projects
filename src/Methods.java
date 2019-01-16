public class Methods {

    //Method that returns empty value

    public static void greet(String name) {
        System.out.println(String.format("Hello, %s", name));
    }

    //Method that returns string value
    public static String greetString(String name) {
        return String.format("Hello, %s, welcome to Java!", name);
    }

    //Method that returns double value

    public static double add(double num1, double num2){


        return num1 + num2;
    }

    //Method that returns int value
    public static int difference(int num1, int num2) {

        return num1 - num2;
    }

    //Boolean method
    public static boolean isEven(int number){
        if(number % 2 == 0) {
            return true;
        } return false;

    }

    public static void main(String[] args) {
        greet("Jake");

        greetString("Steven"); //Prints nothing

        System.out.println(greetString("Jason"));

        System.out.println(add(1, 45)); //Prints their sum

        System.out.println(difference(56, 9)); //Prints their difference

        System.out.println(isEven(220));//Prints true


    }
}
