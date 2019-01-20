import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


       /* Tuna tunaObject = new Tuna();
        tunaObject.simpleMessage();

        additionClass addNumbers = new additionClass();

        addNumbers.addingNumbers(15, 10);

        System.out.println(addNumbers.addingNumbers(10, 20));


        substractionClass substractNumbers = new substractionClass();

        System.out.println(substractNumbers.substractionMethod(90, 45));

        substractNumbers.testMethod();
*/

       //Second testing

        Tuna tunaObject = new Tuna();

        System.out.println("Enter your name here");
        String test = keyboard.nextLine();

        tunaObject.simpleMessage(test);





    }
}
