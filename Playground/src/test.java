import java.util.Scanner;
public class test {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] quizList = new int[5];

        int sum = 0;

//Repeat ask for quiz grades 5 times

        for (int counter = 0; counter<quizList.length; counter++) {

            //Making number = counter +1 in order to display properly in the next print line
            int number = counter +1;

            System.out.println("Please enter quiz grade #" + number);

            int numberEntered = keyboard.nextInt();

            quizList[counter] = numberEntered;

             sum = sum + numberEntered;

        }

        int average = sum / quizList.length;

        System.out.println(String.format("The following quiz grades were entered: %d, %d, %d, %d, %d", quizList[0], quizList[1], quizList[2], quizList[3], quizList[4]));

        System.out.println(String.format("\nTheir sum is equal to: %d, and the average is: %d", sum, average));

    }
}

//85
//15
//10
//17
//45
