
import java.util.Scanner;

public class testing {



    public static void calculateTip(){

        Scanner kb = new Scanner(System.in);

        System.out.println("How much was your check?");
        double checkAmount = kb.nextDouble();


        System.out.println("How much would you like to tip?");
        double tipAmount = kb.nextDouble();

        if (tipAmount < 15) {
            System.out.println("Stop being a cheapo and tip higher!");
        }
        else {

         double newTipAmount = tipAmount/100;

         double adjustedTip = checkAmount * newTipAmount;

         double totalCheck = adjustedTip + checkAmount;

         System.out.println("You're tip amount would be: $" + adjustedTip + " and that brings your total to: $" + totalCheck);


        }



    }


    public static void main(String[] args) {

    calculateTip();
//Test comment

    }


    }



