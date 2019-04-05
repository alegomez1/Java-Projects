package Classwork;
import java.util.*;

public class PracticeArrays2 {
    public static void main(String[] args) {
    int myAges[] = new int[10];
    Scanner keyboard = new Scanner(System.in);

    for (int i = 0; i < myAges.length; i++){
        System.out.println("Enter an age");
        myAges[i] = keyboard.nextInt();
    }

    //Print original array
//        for (int eachAge : myAges){
//           System.out.println(eachAge);
//       }
//
//        doubleUp(myAges);
//
//        for (int eachAge : myAges){
//            System.out.println(eachAge);
//        }

        findMaxAge(myAges);

    }

    public static void doubleUp(int[] anArray){
        for (int i = 0; i < anArray.length; i++){
            anArray[i] = anArray[i] *2;
        }
    }

    public static void findMaxAge(int[] anything){
        int maxAge =anything[0];
        for (int i = 0; i < anything.length; i++){
            if (anything[i] > maxAge){
                maxAge = anything[i];
            }
        }

        System.out.println("The biggest number is " +maxAge);
    }


}
