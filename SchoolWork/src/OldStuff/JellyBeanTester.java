package OldStuff;

import java.util.Scanner;
public class JellyBeanTester

    {
//     These are the 3 global variables that will each hold a OldStuff.JellyBean object.  These variables
//     can be accessed by any method in the tester class because they are global.
        static JellyBean jb1;
        static JellyBean jb2;
        static JellyBean jb3;

        public static void main(String[] args)
        {
            createJellyBeanBag();
            processJellyBeanBag();

            System.out.println("There are a total of " + processJellyBeanBag() + " orange jelly beans");

            System.out.printf("The color of the first jelly bean is %s and the flavor is %s\n", jb1.getColor(), jb1.getFlavor());
            System.out.printf("The color of the second jelly bean is %s and the flavor is %s\n", jb2.getColor(), jb2.getFlavor());
            System.out.printf("The color of the third jelly bean is %s and the flavor is %s\n", jb3.getColor(), jb3.getFlavor());
        }

        /**
         * The createJellyBeanBag method will ask the user for input, and will use that input to create 3 OldStuff.JellyBean objects.
         * It creates 6 different String variables to store all of the user's reponses.
         */
        public static void createJellyBeanBag()
        {
            String firstUserInputJBColor;
            String firstUserInputJBFlavor;

            String secondUserInputJBColor;
            String secondUserInputJBFlavor;

            String thirdUserInputJBColor;
            String thirdUserInputJBFlavor;

            Scanner keyboard = new Scanner(System.in);

            System.out.println("What is the color of the first jelly bean?");
            firstUserInputJBColor = keyboard.nextLine();
            System.out.println("What is the flavor of the first jelly bean?");
            firstUserInputJBFlavor = keyboard.nextLine();
            jb1 = new JellyBean(firstUserInputJBFlavor, firstUserInputJBColor);

            System.out.println("What is the color of the second jelly bean?");
            secondUserInputJBColor = keyboard.nextLine();
            System.out.println("What is the flavor of the second jelly bean?");
            secondUserInputJBFlavor = keyboard.nextLine();
            jb2 = new JellyBean(secondUserInputJBFlavor, secondUserInputJBColor);

            System.out.println("What is the color of the third jelly bean?");
            thirdUserInputJBColor = keyboard.nextLine();
            System.out.println("What is the flavor of the third jelly bean?");
            thirdUserInputJBFlavor = keyboard.nextLine();
            jb3 = new JellyBean(thirdUserInputJBFlavor, thirdUserInputJBColor);
        }


        /**
         *  The processJellyBeanBag() method will check how many OldStuff.JellyBean objects have the flavor of orange,
         *  and will change each of the orange JellyBeans' eatMe attribute to true. The processJellyBeanBag() method will also
         *  count how many JellyBeans are orange in color, and will display that count at the end of the method.
         *  It will also display the content of each of the 3 OldStuff.JellyBean objects.
         */
        public static int processJellyBeanBag()
        {
            int orangeJellyBeanCounter = 0;

            if (jb1.getFlavor().equalsIgnoreCase("orange")){
                orangeJellyBeanCounter ++;
                jb1.setEatMe(true);
            }

            if (jb2.getFlavor().equalsIgnoreCase("orange")){
                orangeJellyBeanCounter ++;
                jb2.setEatMe(true);
            }

            if (jb3.getFlavor().equalsIgnoreCase("orange")){
                orangeJellyBeanCounter ++;
                jb3.setEatMe(true);
            }

            return orangeJellyBeanCounter;

        }

    }