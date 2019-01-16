import java.util.Scanner;

public class WordGame {

    //Restart sections

    static void restartFromSection1(){

        Scanner kb = new Scanner(System.in);

        System.out.println("\nWould you like to restart from the beginning of this seciton?");

        int restartChoice = kb.nextInt();

        if (restartChoice == 1) {

            //Enter section name
            part1();

        }

        else {
            gameOver();
        }

    };

    static void restartFromSection2(){

        Scanner kb = new Scanner(System.in);

        System.out.println("\nWould you like to restart from the beginning of this seciton?");

        int restartChoice = kb.nextInt();

        if (restartChoice == 1) {

            //Enter section name
            part2();

        }

        else {
            gameOver();
        }

    };

    static void restartFromSection3(){

        Scanner kb = new Scanner(System.in);

        System.out.println("\nWould you like to restart from the beginning of this seciton?");

        int restartChoice = kb.nextInt();

        if (restartChoice == 1) {

            //Enter section name
            part3();

        }

        else {
            gameOver();
        }

    };




    //Testing instructions to start off
    static void instructions(){
        Scanner kb = new Scanner(System.in);

        System.out.println("Introduction\n");
        System.out.println("This is a simple text game that uses your input to build a story\n");
        System.out.println("You can select choices by typing the numbers on your keyboard\n");
        System.out.println("If you're ready press 1 to continue!\n");

        int next = kb.nextInt();

        if(next == 1) {
            nameIntro();
        }
		else {

            gameOver();
        }

    };

    //Testing an intro where it asks for name and welcomes user
    static void nameIntro(){
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome fellow adventurer! Are you ready to embark on the quest of your life?");
        System.out.println("1: Absolutely let's go!");
        System.out.println("2: Eh, maybe some other time...");

        int next = kb.nextInt();

        if(next == 1) {

            askName();

        }
		else {
            System.out.println("You're no fun! Time to end your game!\n");
            gameOver();
        }


    };

    static void askName() {

        Scanner kb = new Scanner(System.in);

        System.out.println("What's your name fellow adventurer?");

        String name = kb.nextLine();

        System.out.println(name +" sounds like a really sexy and kinky name... Can't wait to go on this adventure with you...\n");

        System.out.println("Press 1 to start your adventure!");

        int next = kb.nextInt();

        if (next ==1) {
            part1();
        }
        else {
            gameOver();
        }
    }



    //First version of start
   /* static void beginning(){

        Scanner kb = new Scanner(System.in);

        System.out.println("Who's ready for an awesome text adventure?\n\nSelect your answers by typing in 1-4 on the keyboard\n\nIf you're ready to start, press 1");

        int startButton = kb.nextInt();

        if (startButton == 1) {

            System.out.println("Let's go!\n");

            firstQuestion();
        }

    }

    */

    static void gameOver(){
        System.out.println("Game over...Thanks for playing!");

    };


    // Story sections

    static void part1() {

        Scanner kb = new Scanner(System.in);


        System.out.println("It's time to pick up Mia from school, are you gonna take your car or bike? \n");

        System.out.println("1: Car\n2: Bike");

        int choice = kb.nextInt();

        //Advances the game by picking car
        if (choice == 1) {

            System.out.println("You open your garage to reveal your two car options. Your metallic gray Tesla Model S and your black Honda Accord. Which would you like to ride?\n\n1: Tesla Model S\n2: Honda Accord");
            int carChoice = kb.nextInt();

            switch (carChoice) {
                case 1:
                    System.out.println("You step inside your beautiful Tesla, step on the break to turn it on and are greeted with an error: Battery depleted. Please charge.\nIt dawns on you at this moment that you forgot to plug in your car last night...\n");
                    System.out.println("Would you like to take your Honda Accord instead?\n\n1: Yes\n2: No");
                    int hondaChoice = kb.nextInt();
                    if (hondaChoice == 1) {
                        //Contine game
                        part2();
                    }
                    else {
                        //Game over
                        gameOver();
                        restartFromSection1();
                    }
                    break;
                case 2:
                    part2();
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
                        askName();
                    }
                    else {
                        gameOver();
                        restartFromSection1();
                    }
                    break;
                case 2:
                    System.out.println("You took way too long to get to school to pick her up and she was picked up by a stranger...\n\n");
                    gameOver();
                    restartFromSection1();
                    break;

            }


        }

    };

    static void part2() {
        Scanner kb = new Scanner(System.in);

        System.out.println("As you're driving to Mia's school you can't help but think to yourself: My boyfriend is so dumb thinking EVs will take off so soon.");
        System.out.println("You're stopped at a red light and notice two homeless men, one about your age wearing a hat, and the other quite a bit older.\n\nWanna give them something form your hobo basket?\n");
        System.out.println("1: Yes\n2: No, screw the homeless");

        int hoboChoice = kb.nextInt();

        switch(hoboChoice) {
            case 1:
                System.out.println("You roll your window down and call them over. The older hobo comes over to accept your gift, his eyes tear up as he thanks you.");
                System.out.println("As he walks back, his friend lifts his head up to thank you and instantly you recognize the face.\nIt's Jenner. Boy did his life turn to shit after you ditched him.");
                System.out.println("He gets up and starts running towards your car, his eyes light up with desperation, but you floor it as the light turns green.\nNot today Jenner, not today.");
                System.out.println("");

                System.out.println("Press 1 to continue");
                int continueChoice = kb.nextInt();

                if (continueChoice == 1) {
                    //Continue to third part
                    part3();
                }
                else {
                    System.out.println("You pressed the wrong button! Try again!\n");
                    part2();
                }
                break;

            case 2:
                System.out.println("Damn that's a little harsh, but ok. You wait until the light turns green");
                System.out.println("\nPress 1 to continue after the green light.");
                int greenLight = kb.nextInt();
                if(greenLight == 1) {
                    part3();

                }
                else{
                    System.out.println("You didn't press 1 you rule breaker but let's continue anyway...\n\n");
                    part3();
                }
                break;
        }


    };

    static void part3() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Once you're on the expressway, you notice the right side of your car is making a weird noise.\nWould you like to check it out or ignore it and continue driving?");
        System.out.println("\n1: Pull over and check it out\n2: Ignore it #yolo");

        int choice = kb.nextInt();

        if (choice == 1){
            //Pull over and check it out
            System.out.println("You put on your turn signal and pull over on the shoulder.\n" +
                                "When you go to see what was wrong, you noticed that your right front tire is deflated.\n" +
                                 "Oh crap! You think to yourself, you have a spare but don't know how to change it...\n\n" +
                                "You start debating wether to call Mario or Abu, but a random car pulls up behind you. A silver Chevy Malibu.\n" +
                                "A tall young man emerges.");





        }


    };

    public static void main(String[] args) {

        part3();



    }
}



