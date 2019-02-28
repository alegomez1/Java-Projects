
import java.util.Scanner;

public class testing {



    static int sumOfEvens =0;
    static int countOfEvens =0;
    static int usersInput =0;

    public static void processAllEvens(){
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.println("Please enter a number between 5-10");
            usersInput = keyboard.nextInt();
            if (usersInput>10 || usersInput<5){
                System.out.println("Wrong, the number must be between 5-10");

            }
        }while (usersInput>10 || usersInput<5);

        for (int i = 1; i<= usersInput; i++){
            if (i%2==0){
                sumOfEvens = sumOfEvens+i;
                countOfEvens++;
            }
        }



    }

    public static void display(){

        System.out.printf("There were %d even numbers between 1 and %d", countOfEvens, usersInput);
    }

    public static void main(String[] args){
        processAllEvens();

        display();

    }




    }



