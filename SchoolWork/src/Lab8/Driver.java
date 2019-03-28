package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException{
        // Keep asking the user what they want to do here until they chose
        // the option to stop.
        Scanner keyboard = new Scanner(System.in);
        String name, year;

        int menuOption = 0;
        do
        {
            displayMenu();
            System.out.println("What menu option would you like?");
            menuOption = keyboard.nextInt();
            keyboard.nextLine();


            switch (menuOption)
            {
                case 1:
                    //call appropriate method
                    System.out.println("What is the student's name?");
                    name = keyboard.nextLine();


                    System.out.println("What year is the student?");
                    year = keyboard.nextLine();

                    appendToFile(name, year);

                    break;
                case 2:
                    //call appropriate method
                    break;
                case 3:
                    //call appropriate method
                    break;
                case 4:
                    //sout a message that says "bye" and "thanks"
                    break;
                default:
                    //sout a message that says "invalid menu option. try again."
            }


        } while (menuOption != 4);
    }

    public static void appendToFile(String studentName, String yearLevel) throws IOException {
        // Add a the data for a new student to the file.

        String studentInfo = yearLevel + " " + studentName;

        FileWriter fw = new FileWriter("Students.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(studentInfo);

        pw.close();

        Scanner inputFile = new Scanner(new File("Students.txt"));

        inputFile.close();


        //FileWriter allows the file to be appended as long as we reference it in PrintWriter (fw)
//        FileWriter fw = new FileWriter("output.txt", true);
//        PrintWriter pw = new PrintWriter(fw);
//        pw.println(sentence);
//
//        pw.close();

    }

    public static void deleteAllRecords() throws IOException {
        // Remember that using the PrintWriter with the file name as the paramater
        // will overwrite the contents of the file.


    }

    public static void countStudents() throws FileNotFoundException {
        // Print out how many seniors, juniors, sophomores, and freshman there are.
        // Example: 1 Freshman, 2 Sophmore, 1 Junior, and 1 Senior students.

        //create file object using the real file name
        /*
        *   Create a scanner pbject using the file object
        *   While loop (while inputFile.hasNext() )
        *   Read each record into a variable(s) using .nextLine()
        *   Set counters for F S and s
        *   Print number of each
        *
         */


    }

    public static void displayMenu()
    {
        System.out.println("Enter a menu choice:" );
        System.out.println("\n1.  Add a student to the file. ");
        System.out.println("2.  Delete the contents of the file.");
        System.out.println("3.  Print out how many seniors, juniors, sophomores, and freshman there are.");
        System.out.println("4.  Exit.");
    }

}
