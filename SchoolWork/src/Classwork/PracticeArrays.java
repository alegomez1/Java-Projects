package Classwork;

import java.util.Scanner;
import java.io.*;

public class PracticeArrays {
    public static void main(String[] args) throws  IOException{
        int myAges[] = new int[20];

        Scanner keyboard = new Scanner(System.in);
        int searchValue = keyboard.nextInt();
        int i = 0;

        File aFile = new File("ages.txt");
        Scanner inFile = new Scanner(aFile);

        while (inFile.hasNext() && i < myAges.length){

            myAges[i] = inFile.nextInt();
            i++;
        }

        //Enhanced for loop

        for (int anAge : myAges){
            System.out.println(anAge);
        }

        System.out.println("What number do you wish to search for?");


    }

}
