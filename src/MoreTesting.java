import java.util.Scanner;

public class MoreTesting {



    public static void main(String[] args){

      stringTester();

    }

    public static void piHelper(){
        Scanner kb = new Scanner(System.in);

        int number = 0;

        String pi = "3.1415926535897932384626433832795028841971";
        char[] piArray = pi.toCharArray();

        System.out.println("Print how many digits you know of pi");
        char[] userInput = kb.nextLine().toCharArray();

        for (int i=0; i<userInput.length; i++){

            if (userInput[i] == piArray[i]){
                number=i-1;
            }

            else if (userInput[i] != piArray[i]){
                System.out.printf("Wrong! %s should be %s", userInput[i], piArray[i]);
                number = i-1;

            }

        }

        System.out.println("You know pi to: " + number + " decimal places");


    }

    public static void stringTester(){

    }
}
