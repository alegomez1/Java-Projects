import java.util.Random;

public class RandomDice {

    public static void main(String[] args) {

        Random rand = new Random(); //Initializing rand object from Random class
        int frequency[] = new int[7]; //Creating a new integer array

        for (int roll=1;roll<1000;roll++) {
            ++frequency[1+rand.nextInt(6)]; //Adding 1 to the rand.nextInt allows the index to go rather than 0-5, to 1-6. Moves it up 1.
            //Every time a number is rolled, it adds one to that index of frequency, hence the ++frequency
        }

        System.out.println("Face\tFrequency");

        //Start face at 1 since dice won't have a 0
        for(int face=1;face<frequency.length;face++) {
            System.out.println(face + "\t" + frequency[face]); //Prints out the frequency of the face value
        }



    }
}
