import javax.swing.JOptionPane;

public class MainClass {

    //Opening message to the game
    public static void introduction() {
        JOptionPane.showMessageDialog(null, "Welcome to this text adventure! Please press 'ok' to continue");
        String name = JOptionPane.showInputDialog("Let's get started with your name");
        String strStart = JOptionPane.showInputDialog("Alright then " + name + ", are you ready to start on this amazing adventure?" +
                "\n1: Yes, let's go!" +
                "\n2: Absolutely not...");
        int start = Integer.parseInt(strStart);
        if (start == 1) {
            //Continue onto part 1
            part1();
        }
        else {
            //Game over option
            gameOver();
        }

    }

    //Game over method
    public static void gameOver() {
        JOptionPane.showMessageDialog(null, "Game over...\nThanks for playing");
    }

    //Part 1 method
    public static void part1(){
       String strTransportChoice = JOptionPane.showInputDialog("It's time to pick Mia up from school. Would you like to take your bike or car?" +
               "\n1: Bike" +
               "\n2: Car");
       int transportChoice = Integer.parseInt(strTransportChoice);
       //Picking bike
       if (transportChoice == 1) {
           String strBikeOption = JOptionPane.showInputDialog("How would you like to ride your bike?" +
                   "\n1: Like a badass poping wheelies" +
                   "\n2: Like a puss all slow and carefully");
           int bikeOption = Integer.parseInt(strBikeOption);
           //Both bike options lead to gameOver()
           if (bikeOption == 1) {
               JOptionPane.showMessageDialog(null,"You were too busy popping wheelies and bounced off the curb and got hit by a car." +
                       "\nMia was picked up super late from school and now you've lost both your legs and one arm...");
               gameOver();

           }
           else if (bikeOption == 2) {
               JOptionPane.showMessageDialog(null, "You were riding much too carefully and took way too long to get to school" +
                       "\nBecause of this, Mia was picked up by a total stranger because you weren't anywhere to be found...");
               gameOver();
           }

       }
       //Picking car
       else {
                String strCarChoice = JOptionPane.showInputDialog("You open your garage to reveal your two car options. Your metallic gray Tesla Model S and your black Honda Accord. Which would you like to ride?" +
                        "\n1: Tesla Model S\n2: Honda Accord");
                int carChoice = Integer.parseInt(strCarChoice);
                //carChoice 1 leads to gameOver()

                //Picking Tesla Model S
                if (carChoice == 1) {
                    JOptionPane.showMessageDialog(null, "You step inside your beautiful Tesla, step on the break to turn it on and are greeted with an error: 'Battery depleted. Please charge.'" +
                            "\n" +
                            "It dawns on you at this moment that you forgot to plug in your car last night...");
                   String strHondaChoice = JOptionPane.showInputDialog("Would you like to take your Honda Accord instead?" +
                           "\n1: Yes, she's my reliable ride" +
                           "\n2: Nah, someone else can get Mia");
                   int hondaChoice = Integer.parseInt(strHondaChoice);

                   switch (hondaChoice){
                       case 1:
                           //Advance to part 2
                           break;

                       case 2:
                           //Game over
                           gameOver();

                       default:
                           //Maybe add a default message here
                           gameOver();
                   }


                }

                //Picking Honda
                else {
                    //Advance to part 2
                    part2();

                }
       }
    }

    //Part 2 method
    public static void part2() {
        JOptionPane.showMessageDialog(null, "As you're driving to Mia's school you can't help but think to yourself how dumb your " +
                                                                     "boyfriend Jake is for thinking EVs will take off so quickly");
        String strHomelessChoice = JOptionPane.showInputDialog("You pull up to a red light and notice two homeless men off to your right side." +
                "\nOne is about your age hiding his face under a hat, while the other is noticeably older." +
                "\nWould you like to give them something from your hobo basket?" +
                "\n1: For sure, I can spare some things" +
                "\n2: No screw the homeless");
        int homelessChoice = Integer.parseInt(strHomelessChoice);

        //Both options advance the story
        switch (homelessChoice) {
            //Giving something and advancing
          case 1:
                JOptionPane.showMessageDialog(null, "You roll your window down and hand off some things to the older hobo." +
                        "\nHis eyes begin to tear up as he thanks you for your kindness and starts walking towards the other hobo" +
                        "\nIn that moment the younger hobo lifts his hat and starts sprinting towards you, desperation in his eyes");
                JOptionPane.showMessageDialog(null, "It's Jenner!");
                JOptionPane.showMessageDialog(null, "You step on the gas as the light turns green and book it out of there" +
                        "\nBehind you his crys are heard as he begs you to come back to him. Boy did his life turn to shit after you left him" +
                        "\nYou think to yourself, 'not today Jenner, not today.");
                //Part 3
              part3();

                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Well, that's a little harsh but ok...");
                //Part 3
                part3();
                break;

        }

    }

    //Part 3 method
    public static void part3() {
        String strTireChoice = JOptionPane.showInputDialog("Once on the expressway you begin to hear a weird noise coming from the right side of your car." +
                "\nWould you like to pull over and check it out, or ignore it cause you're a badass?" +
                "\n1: Pull over and check it out" +
                "\n2: Keep driving cause #yolo");
        int tireChoice = Integer.parseInt(strTireChoice);
        switch (tireChoice) {
            case 1:
                JOptionPane.showMessageDialog(null, "You carefully pull over to the shoulder, making sure to turn on your turn signal" +
                        "\nYou step out of your car to see that your front right tire is deflated." +
                        "\n'Crap!' You think to yourself, you have a spare, but don't know how to change it" +
                        "\nAs you start thinking whether to call Oscar or Mario, a Signature Red Tesla Model S pulls up behind you...");
                JOptionPane.showMessageDialog(null, "A tall dirty blonde guy steps out, you think this dude has to be a male model from how handsome he is." +
                        "\nHe asks if you need help changing the tire, and before you finish answering, he's on the ground changing it for you." +
                        "\nYou start to swoon");
                JOptionPane.showMessageDialog(null, "As he's working, you're stripping him with your eyes and imagining all the different ways you'd like to take him to bed..." +
                        "\nOnce he's done he gets up, wipes some sweat from his brow, and walks over to you.");
                JOptionPane.showMessageDialog(null, "I don't think we formally introduced ourselves, my name is Alex, but I usually go by 'Mandingo'." +
                        "\nYou mumble your name out and make some small talk." +
                        "\nYou exchange numbers and think to yourself, 'well, Jake's getting cheated on tonight...");
                JOptionPane.showMessageDialog(null, "You get back in your car and drive off, fantasizing about Mandingo...");

                part4();
                break;
                //Continue to part4
            case 2:
                JOptionPane.showMessageDialog(null, "You keep driving and eventually your tire blows! You swerve on the expressway and narrowly avoid hitting some cars." +
                        "\nYou manage to pull over on the shoulder and go see the damage...");
                JOptionPane.showMessageDialog(null, "Crap!' You think to yourself, you have a spare, but don't know how to change it" +
                        "\nAs you start thinking whether to call Oscar or Mario, a Signature Red Tesla Model S pulls up behind you...");
                JOptionPane.showMessageDialog(null, "A tall dirty blonde guy steps out, you think this dude has to be a male model from how handsome he is." +
                        "\nHe asks if you need help changing the tire, and before you finish answering, he's on the ground changing it for you." +
                        "\nYou start to swoon");
                JOptionPane.showMessageDialog(null, "As he's working, you're stripping him with your eyes and imagining all the different ways you'd like to take him to bed..." +
                        "\nOnce he's done he gets up, wipes some sweat from his brow, and walks over to you.");
                JOptionPane.showMessageDialog(null, "I don't think we formally introduced ourselves, my name is Alex, but I usually go by 'Mandingo'." +
                        "\nYou mumble your name out and make some small talk." +
                        "\nYou exchange numbers and think to yourself, 'well, Jake's getting cheated on tonight...");
                JOptionPane.showMessageDialog(null, "You get back in your car and drive off, fantasizing about Mandingo...");

                part4();
                break;
            //Continue to part4

        }

    }

    //Part 4 method
    public static void part4() {
        JOptionPane.showMessageDialog(null, "You made it to Mia's school just on time and pick up lil dill." +
                "\nOn your drive back you keep thinking about whether to drop Mia off and go get some Mandingo, or go back to Jake's house");
        String strMandingo = JOptionPane.showInputDialog("Would you like to get Mandingosized and hang out with Alex, or go back to Jake's house and be bored by a sexless relationship..." +
                "\n1: Get Mandingosized by Alex" +
                "\n2: Go to your bf's Jake's house");
        int mandingo = Integer.parseInt(strMandingo);
        switch (mandingo) {
            case 1:
                JOptionPane.showMessageDialog(null, "You drop off Mia at your best friend Weli's house and head over to Alex's..." +
                        "\nHe opens the door and the rest is history.......");
                JOptionPane.showMessageDialog(null, "Thanks for playing!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "You head to Jake's house and load up some Netflix, unfortunately for you, there will be no chilling...");
                JOptionPane.showMessageDialog(null, "Thanks for playing!");
                break;

        }

    }






    public static void main(String[] args) {

    introduction();

    }
}