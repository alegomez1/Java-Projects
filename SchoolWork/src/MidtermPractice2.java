import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;


public class MidtermPractice2 {

    static int loopCount = 0;
    static int totalWrong = 0;

    public static void main(String[] args) {
        addition();
        summary();
    }

    /*
    *   This method asks the user how many times they would like to practice addition and then runs a loop that number of times
    *   While doing so, it tells the user if they got an answer correct or incorrect
    *   If the answer is incorrect, it adds a 1 to the global variable totalWrong to keep track of how many times the user gets the answer incorrect
     */
    public static void addition(){

        Random myRan = new Random();
        Scanner keyboard = new Scanner(System.in);
        int userAnswer, ranNum1, ranNum2, correctAnswer;

        System.out.println("How many times would you like to practice your addition?");
        loopCount = keyboard.nextInt();

        for (int i = 0; i<loopCount; i++){
           ranNum1 = myRan.nextInt(10) +1;
           ranNum2 = myRan.nextInt(10) +1;

           System.out.printf("What is the sum of %d + %d?\n", ranNum1, ranNum2);
           userAnswer = keyboard.nextInt();
           correctAnswer = ranNum1+ranNum2;

           if (userAnswer == correctAnswer){
               System.out.println("Correct!");
           }
           else if (userAnswer != correctAnswer){
               System.out.println("Wrong, try again");
               totalWrong += 1;
           }

        }


    }

    /*
    *   This method is used to summarize the results based on the addition() method
    *   It shows the user how many times the loop ran by displaying the loopCount global variable, as well as how many answers the user got incorrect based on the totalWrong global variable
    *   Finally, it shows the user the percentage they got wrong by using a double variable called percentWrong
    *   In order to properly display percentWrong, I cast totalWrong to be a double and then used DecimalFormat to properly display the percent rounded to two decimal places
     */
    public static void summary(){

        double percentWrong = ((double)totalWrong / loopCount) * 100;
        DecimalFormat change = new DecimalFormat("0.00#####");

        System.out.printf("There were %d addition problems generated\n", loopCount);
        System.out.printf("The total number of problems answered wrong were %d\n", totalWrong);
        System.out.println("The percentage wrong is " + change.format(percentWrong) + "%");



    }
}
