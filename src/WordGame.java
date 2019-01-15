import java.util.Scanner;

public class WordGame {

    // First questions

    static void firstQuestion() {

        Scanner kb = new Scanner(System.in);


        System.out.println("It's time to pick up Mia from school, are you gonna take your car or bike?");

        System.out.println("1: Car\n2: Bike");

        int choice = kb.nextInt();

        //Advances the game
        if (choice == 1) {

        System.out.println("Time to ride!");


        }

        else if (choice == 2){

            //Bothe these choices lead to losing

            System.out.println("Do you wanna ride like a badass and pop wheelies on the way there or ride like a puss and very carefully?\n1: Badass\n2: Puss-like");

           int rideChoice = kb.nextInt();

           switch (rideChoice){
               case 1:
                   System.out.println("You were too busy popping wheelies and bounced off the curb and got hit by a car.\nMia was picked up super late from school and now you've lost both your legs and one arm...");
                   break;
               case 2:
                   System.out.println("You took way too long to get to school to pick her up and she was picked up by a stranger...");
                   break;
           }


        };




    };

    public static void main(String[] args) {




        Scanner kb = new Scanner(System.in);

        System.out.println("Who's ready for an awesome text adventure?\n\nSelect your answers by typing in 1-4 on the keyboard\n\nIf you're ready to start, press 1");

        int startButton = kb.nextInt();

        if (startButton == 1) {

            System.out.println("Let's go!\n");

            firstQuestion();
        }


    }
}
