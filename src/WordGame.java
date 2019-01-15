import java.util.Scanner;

public class WordGame {

 //Beginning of story. Go here to restart
    static void beginning(){
        
         Scanner kb = new Scanner(System.in);

        System.out.println("Who's ready for an awesome text adventure?\n\nSelect your answers by typing in 1-4 on the keyboard\n\nIf you're ready to start, press 1");

        int startButton = kb.nextInt();

        if (startButton == 1) {

            System.out.println("Let's go!\n");

            firstQuestion();
        }
        
    }

  
    // First questions

    static void firstQuestion() {

        Scanner kb = new Scanner(System.in);


        System.out.println("It's time to pick up Mia from school, are you gonna take your car or bike?");

        System.out.println("1: Car\n2: Bike");

        int choice = kb.nextInt();

        //Advances the game by picking car
        if (choice == 1) {

        System.out.println("You open your garage to reveal your two car options. Your metallic gray Tesla Model S and your black Honda Accord. Which would you like to ride?\n1: Tesla Model S\n2: Honda Accord");
        int carChoice = kb.nextInt();
        
        switch (carChoice) {
            case 1:
                System.out.println("You step inside your beautiful Tesla, step on the break to turn it on and are greeted with an error: Baterry depleted. Please charge.\nIt dawns on you at this moment that you forgot to plug in your car last night...");
                System.out.println("Would you like to take your Honda Accord instead?\n1: Yes\n2: No");
                int hondaChoice = kb.nextInt();
                if (hondaChoice == 1) {
                    //Contine game
                    secondPart();
                }
                else {
                    //Game over
                    System.out.println("Game over! Thanks for playing!");
                }
                break;
            case 2:
                secondPart();
                break;
                
                
        }

        }

        else if (choice == 2){

            //Both these choices lead to losing

            System.out.println("Do you wanna ride like a badass and pop wheelies on the way there or ride like a puss and very carefully?\n1: Badass\n2: Puss-like");

           int bikeChoice = kb.nextInt();

           switch (bikeChoice){
               case 1:
                   System.out.println("You were too busy popping wheelies and bounced off the curb and got hit by a car.\nMia was picked up super late from school and now you've lost both your legs and one arm...\n");
                   System.out.println("Would you like to restart?\n1:Yes\n2:No");
                   int restartChoice = kb.nextInt();
                   if (restartChoice ==1){
                       beginning();
                   }
                   else {
                       System.out.println("Game over! Thanks for playing!");
                   }
                   break;
               case 2:
                   System.out.println("You took way too long to get to school to pick her up and she was picked up by a stranger...\n");
                   System.out.println("Would you like to restart?\n1:Yes\n2:No");
                   int restartChoice2 = kb.nextInt();
                   if (restartChoice2 ==1){
                       beginning();
                   }
                   else {
                       System.out.println("Game over! Thanks for playing!");
                   }
                   break;
           }


        }

    };
    
    static void secondPart() {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("As you're driving to Mia's school you can't help but think to yourself: My boyfriend is so dumb thinking EVs will take off so soon.");
        System.out.println("You're stopped at a red light and notice two homeless men, one about your age wearing a hat, and the other quite a bit older.\nWanna give them something form your hobo basket?");
        System.out.println("1: Yes\n2: No, screw the homeless");
        
        int hoboChoice = kb.nextInt();
        
        switch(hoboChoice) {
            case 1:
                System.out.println("You roll your window down and call them over. The older hobo comes over to accept your gift, his eyes tear up as he thanks you.");
                System.out.println("As he walks back, his friend lifts his head up to thank you and instantly you recognize the face.\nIt's Jenner. Boy did his life turn to shit after you ditched him.");
                System.out.println("He gets up and starts running towards your car, his eyes light up with desperation, but you floor it as the light turns green.\nNot today Jenner, not today.");
                
        }
        
        
    };

    public static void main(String[] args) {

        secondPart();


       


    }
}

