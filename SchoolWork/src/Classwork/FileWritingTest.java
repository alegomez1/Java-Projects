package Classwork;
import java.io.*;
import java.util.Scanner;

public class FileWritingTest {

    public static void main(String[] args) throws IOException{
        //have to add throws IOException
        Scanner keyboard= new Scanner(System.in);
        String firstName, major;
        int age;

        System.out.println("What is your first name?");
        firstName = keyboard.nextLine();

        System.out.println("What is your major?");
        major = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();

        String sentence = firstName + " is majoring in " + major + " and is " + age + " years old";
        System.out.println(sentence);

        //FileWriter allows the file to be appended as long as we reference it in PrintWriter (fw)
        FileWriter fw = new FileWriter("output.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(sentence);

        pw.close();

        Scanner inputFile = new Scanner(new File("output.txt"));

        while(inputFile.hasNext()){
            sentence = inputFile.nextLine();
            System.out.println(sentence);
        }
        inputFile.close();


    }
}
