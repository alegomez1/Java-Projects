import java.util.Random;

public class Playground {
    public static void main(String[] args) {
        System.out.println(numberGuesser("123"));
    }

    //Takes a name and returns the initials capitalized with a dot between them
    public static String abbrevName(String name) {
        char[] userName = name.toCharArray();
        char firstInitial = userName[0];

        char secondInitial;
        int spaceIndex=0;
        int nothing =0;

        for (int i = 0; i<userName.length; i++){
            if (userName[i] == ' ') {
                spaceIndex = i;

            } else {
                nothing =i;

            }
        }
        System.out.println(spaceIndex);
        secondInitial = userName[spaceIndex+1];



        name = firstInitial + "." + secondInitial;
       name = name.toUpperCase();
        return name;
    }
    //Takes an int array and returns the value of each number multiplied in order
    public static int grow(int[] x){
        int[] myArray = x;

        int counter = 1;
        for(int i =0; i<myArray.length; i++){
            counter *= x[i];
        }
        return counter;

    }

    public static int numberGuesser(String yourGuess){
        Random myRan = new Random();
        int ranNum1 = myRan.nextInt(9)+1;
        int ranNum2 = myRan.nextInt(9)+1;
        int ranNum3 = myRan.nextInt(9)+1;

        char[] randomNumbers = new char[3];
        randomNumbers[0] = (char)ranNum1;
        randomNumbers[1] = (char)ranNum2;
        randomNumbers[2] = (char)ranNum3;

        char[]userGuess = yourGuess.toCharArray();

        int numberCorrect =0;

        for (int i =0; i<userGuess.length; i++){

            for (int j =0; j<randomNumbers.length; j++){

                if (userGuess[i] == randomNumbers[j]){
                    numberCorrect++;
                }
            }
        }

        System.out.println("work");


        return numberCorrect;
    }
}
