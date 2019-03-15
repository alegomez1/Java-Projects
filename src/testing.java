import java.util.Random;
import java.util.Scanner;

// https://www.w3resource.com/java-exercises/basic/index.php

public class testing {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {


        sentenceCounter();


    }

    public static void challenge37(){

        System.out.println("Enter a sentence");
        char[] letters = kb.nextLine().toCharArray();
        for (int i = letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
    }

    //Write a Java program to count the letters, spaces, numbers and other characters of an input string
    public static void challenge38(){

        int letterCount =0;
        int spaceCount=0;
        int numberCount=0;
        int otherCount=0;

        System.out.println("Enter a sentence with numbers and period too");
        char[] sentence = kb.nextLine().toCharArray();

        for (int i = 0; i<sentence.length; i++){
            if (Character.isLetter(sentence[i])){
                letterCount++;
            }
            else if (Character.isSpaceChar(sentence[i])){
                spaceCount++;
            }
            else if (Character.isDigit(sentence[i])){
                numberCount++;
            }
            else {
                otherCount++;
            }
        }
        System.out.printf("Letters: %d" +
                "\nNumbers: %d" +
                "\nSpaces: %d" +
                "\nOther: %d", letterCount, numberCount, spaceCount, otherCount);
    }

    //Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
    public static void challenge44(int number){
        int firstNumber, secondNumber, thirdNumber, sum;
        firstNumber = number;
        secondNumber = number * 11;
        thirdNumber = number * 111;
        sum = firstNumber + secondNumber + thirdNumber;

        System.out.printf("%d + %d + %d = %d", firstNumber, secondNumber, thirdNumber, sum);
    }

    public static void sentenceCounter(){
        int letterCounter=0;
        int spaceCounter=0;
        int numberCounter=0;
        int otherCounter=0;

        System.out.println("Enter a sentece with numbers, spaces, letters, and weird characters");
        char[] sentence = kb.nextLine().toCharArray();
        for (int i=0; i<sentence.length; i++){
            if (Character.isLetter(sentence[i])) letterCounter++;
            else if (Character.isDigit(sentence[i])) numberCounter++;
            else if (Character.isSpaceChar(sentence[i])) spaceCounter++;
            else otherCounter++;
        }

        System.out.printf("Letters: %d\nNumbers: %d\nSpaces: %d\nOther: %d",letterCounter,numberCounter,spaceCounter,otherCounter);
    }

    public static void a99BottlesOfBeer() {
        for (int i = 99; i > 0; i--) {
            if (i != 1) {
                System.out.printf(
                        "%d bottles of beer on the wall\n" +
                                "%d bottles of beer\n" +
                                "Take one down, pass it around\n" +
                                "%d bottles of beer on the wall\n\n", i, i, i - 1);
            } else {
                System.out.printf(
                        "%d bottle of beer on the wall\n" +
                                "%d bottle of beer\n" +
                                "Take one down, pass it around\n" +
                                "No more bottles of beer on the wall\n\n", i, i);
            }
        }
    }

    public static void AplusB(int firstNumber, int secondNumber){
        if ((firstNumber >= -1000 && secondNumber >=-1000) && (firstNumber <= 1000 && secondNumber <= 1000) ){
            int sum = firstNumber + secondNumber;
            System.out.println(sum);
        } else
            System.out.println("Those numbers are out of the range");

    }

    public static void baconCipher(){
        System.out.println("Welcome to the Bacon cipher!\n");
        System.out.println("Please enter a word or phrase to be encrypted");
        char[] userInput = kb.nextLine().toCharArray();
        String enryptedWord = "";


        for (int i = 0; i<userInput.length; i++){
            if (userInput[i] == 'A' || userInput[i] == 'a'){
                enryptedWord += "AAAAA ";
            }
            else if (userInput[i] == ' '){
                enryptedWord += "/ ";
            }
            else if (userInput[i] == 'B' || userInput[i] == 'b'){
                enryptedWord += "AAAAB ";
            }
            else if (userInput[i] == 'C' || userInput[i] == 'c'){
                enryptedWord += "AAABA ";
            }
            else if (userInput[i] == 'D' || userInput[i] == 'd'){
                enryptedWord += "AAABB ";
            }
            else if (userInput[i] == 'E' || userInput[i] == 'e'){
                enryptedWord += "AABAA ";
            }
            else if (userInput[i] == 'F' || userInput[i] == 'f'){
                enryptedWord += "AABAB ";
            }
            else if (userInput[i] == 'G' || userInput[i] == 'g'){
                enryptedWord += "AABBA ";
            }
            //************************************Work edits start here*******************************************
            else if (userInput[i] == 'H' || userInput[i] == 'h'){
                enryptedWord += "AABBB ";
            }
            else if (userInput[i] == 'I' || userInput[i] == 'i' || userInput[i] == 'J' || userInput[i] == 'j') {
                enryptedWord += "ABAAA ";
            }
            else if (userInput[i] == 'K' || userInput[i] == 'k'){
                enryptedWord += "ABAAB ";
            }
            else if (userInput[i] == 'L' || userInput[i] == 'l'){
                enryptedWord += "ABABA ";
            }
            else if (userInput[i] == 'M' || userInput[i] == 'm'){
                enryptedWord += "ABABB ";
            }
            else if (userInput[i] == 'N' || userInput[i] == 'n'){
                enryptedWord += "ABBAA ";
            }
            else if (userInput[i] == 'O' || userInput[i] == 'o'){
                enryptedWord += "ABBAB ";
            }
            else if (userInput[i] == 'P' || userInput[i] == 'p'){
                enryptedWord += "ABBBA ";
            }
            else if (userInput[i] == 'Q' || userInput[i] == 'q'){
                enryptedWord += "ABBBB ";
            }
            else if (userInput[i] == 'R' || userInput[i] == 'r'){
                enryptedWord += "BAAAA ";
            }
            else if (userInput[i] == 'S' || userInput[i] == 's'){
                enryptedWord += "BAAAB ";
            }
            else if (userInput[i] == 'T' || userInput[i] == 't'){
                enryptedWord += "BAABA ";
            }
            else if (userInput[i] == 'U' || userInput[i] == 'u' || userInput[i] == 'V' || userInput[i] == 'v') {
                enryptedWord += "BAABB ";
            }
            else if (userInput[i] == 'W' || userInput[i] == 'w'){
                enryptedWord += "BABAA ";
            }
            else if (userInput[i] == 'X' || userInput[i] == 'x'){
                enryptedWord += "BABAB ";
            }
            else if (userInput[i] == 'Y' || userInput[i] == 'y'){
                enryptedWord += "BABBA ";
            }
            else if (userInput[i] == 'Z' || userInput[i] == 'z'){
                enryptedWord += "BABBB ";
            }
            
           
        }

        System.out.println(enryptedWord);

    }
    
    public static void decipherMethod(){
        int wordsToDecipher = 0;

        
        System.out.println("How many codes do you want to decipher?\n"
                          + "e.g.: ABBBA AABBA equals two codes");
                           
        wordsToDecipher = kb.nextInt();
        int spaces = wordsToDecipher -1;
        char[] phrase = new char[wordsToDecipher + spaces];
                           
        //for loop that runs wordsToDecipher times
                           
        for(int i = 0; i<wordsToDecipher; i++) {
            System.out.println("Enter code");
            String userInput = kb.nextLine();
            
            if(userInput == "/"){
             phrase[i] = ' ';
            }
            else if(userInput == "AAAAA"){
             phrase[i] = 'A';
            }
            else if(userInput == "AAAAB"){
                phrase[i] = 'B';
            }
            else if(userInput == "AAABA"){
                phrase[i] = 'C';
            }                    
            else if(userInput == "AAABB"){
                phrase[i] = 'D';
            }
            else if(userInput == "AABAA"){
                phrase[i] = 'E';
            }                    
            else if(userInput == "AABAB"){
                phrase[i] = 'F';
            }                    
            else if(userInput == "AABBA"){
             phrase[i] = 'G';
            }                    
            else if(userInput == "AABBB"){
             phrase[i] = 'H';
            }    
                    //DOUBLE I AND J
            else if(userInput == "ABAAA"){
             phrase[i] = 'I';
            }                    
            else if(userInput == "ABAAB"){
             phrase[i] = 'K';
            }                    
            else if(userInput == "ABABA"){
             phrase[i] = 'L';
            }                    
            else if(userInput == "ABABB"){
             phrase[i] = 'M';
            }  
            else if(userInput == "ABBAA"){
             phrase[i] = 'N';
            }                     
            else if(userInput == "ABBAB"){
             phrase[i] = 'O';
            }                     
            else if(userInput == "ABBBA"){
             phrase[i] = 'P';
            }                     
            else if(userInput == "ABBBB"){
             phrase[i] = 'Q';
            }                     
            else if(userInput == "BAAAA"){
             phrase[i] = 'R';
            }                     
            else if(userInput == "BAAAB"){
             phrase[i] = 'S';
            }                     
            else if(userInput == "BAABA"){
             phrase[i] = 'T';
            }                  
                    //DOUBLE U AND V
            else if(userInput == "BAABB"){
             phrase[i] = 'U';
            }                    
            else if(userInput == "BABAA"){
             phrase[i] = 'W';
            }                    
            else if(userInput == "BABAB"){
             phrase[i] = 'X';
            }                           
            else if(userInput == "BABBA"){
             phrase[i] = 'Y';
            }                    
            else if(userInput == "BABBB"){
             phrase[i] = 'Z';
            }                    
                    
                    
        }//end for loop
        System.out.println(phrase);
        System.out.println("test");
        
    }//end decipher method






}





