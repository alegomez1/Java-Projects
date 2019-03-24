package PhoneNumberCreator;
import java.util.Random;

public class PhoneNumberCreator {

    public static void main(String[] args) {



    }

    public static void miamiNumber() {
        Random myRan = new Random();
        String firstNumber = "305";

        int restOfNumber = myRan.nextInt(9999999);
        String newNumber = firstNumber.concat(String.valueOf(restOfNumber));

        System.out.println(newNumber);
    }
}