import java.util.Random;

public class Playground {
    public static void main(String[] args) {

        numberGuesser("123");
    }

    //Takes a name and returns the initials capitalized with a dot between them
    public static String abbrevName(String name) {
        char[] userName = name.toCharArray();
        char firstInitial = userName[0];

        char secondInitial;
        int spaceIndex = 0;
        int nothing = 0;

        for (int i = 0; i < userName.length; i++) {
            if (userName[i] == ' ') {
                spaceIndex = i;

            } else {
                nothing = i;

            }
        }
        System.out.println(spaceIndex);
        secondInitial = userName[spaceIndex + 1];


        name = firstInitial + "." + secondInitial;
        name = name.toUpperCase();
        return name;
    }

    //Takes an int array and returns the value of each number multiplied in order
    public static int grow(int[] x) {
        int[] myArray = x;

        int counter = 1;
        for (int i = 0; i < myArray.length; i++) {
            counter *= x[i];
        }
        return counter;

    }

    public static void numberGuesser(String yourGuess) {
        String enteredGuess = yourGuess;
        Random myRan = new Random();
        int ranNum1 = myRan.nextInt(9) + 1;
        int ranNum2 = myRan.nextInt(9) + 1;
        int ranNum3 = myRan.nextInt(9) + 1;
        //While statements ensure no repeating numbers
        while (ranNum2 == ranNum1) {
            ranNum2 = myRan.nextInt(9) + 1;
        }
        while ((ranNum3 == ranNum1) || (ranNum3 == ranNum2)) {
            ranNum3 = myRan.nextInt(9) + 1;
        }

        final int RADIX = 10; //I don't know why but this value of 10 converts the int to char using the Character class and forDigit function
        char num1 = Character.forDigit(ranNum1, RADIX);
        char num2 = Character.forDigit(ranNum2, RADIX);
        char num3 = Character.forDigit(ranNum3, RADIX);
        char[] randomNumbers = {num1, num2, num3};

        char[] userGuess = yourGuess.toCharArray();

        int numberCorrect = 0;
        int correctAndSameIndex = 0;
        //This loop runs the length of the user's guess
        for (int i = 0; i < userGuess.length; i++) {
            //First it checks to see if the user's guess at a certain index is equal to the random number at that index
            if (userGuess[i] == randomNumbers[i]) {
                correctAndSameIndex++;
                numberCorrect++;
                //If not, it runs another loop to check all the numbers in the randomNumber array to see if the user guessed any of those
            } else {
                for (int j = 0; j < randomNumbers.length; j++) {

                    if (userGuess[i] == randomNumbers[j]) {
                        numberCorrect++;
                    }
                }
            }
        }
        //Prints out the results to the user
        System.out.println("The random number generated was: " + num1 + num2 + num3);
        System.out.println("Your guess was: " + enteredGuess);
        System.out.printf("So you got %d correct, and out of those, %d were also in the correct spot!", numberCorrect, correctAndSameIndex);
    }

}
