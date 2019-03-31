package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
    /*
    *   Here in main there is a do-while loop that runs as long as the option does not equal 4 which is to exit the program
    *   Within the loop there is a switch statement, and depending on the user's response to the displayMenu() method, a different part of the program will run
     */
    public static void main(String[] args) throws IOException{

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
                    System.out.println("What is the student's name?");
                    name = keyboard.nextLine();


                    System.out.println("What year is the student?\n" +
                            "F = Freshman\n" +
                            "s = Sophmore\n" +
                            "J = Junior\n" +
                            "S = Senior");
                    year = keyboard.nextLine();

                    appendToFile(name, year);

                    break;
                case 2:
                    deleteAllRecords();
                    break;
                case 3:
                    countStudents();
                    break;
                case 4:
                    System.out.println("Bye, thanks!");
                    break;
                default:
                    System.out.println("Invalid option, try again");
            }


        } while (menuOption != 4);
    }
    /*
    *   This method accepts two String parameters which are the student's name and their year level
    *   These parameters get concatenated in a String variable called studentInfo
    *   An instance of the FileWriter is then created which accepts the file name and a boolean as parameters
    *   Then an instance of the PrintWriter class is created and accepts the FileWriter object as a parameter
    *   The PrintWriter object then adds a line containing the value of studentInfo, and then closes
    *   Then an instance of the Scanner class is created and it accepts an instance of the File class as a parameter. The file class takes the file name as a parameter
    *   Then the Scanner object is closed
    *
     */
    public static void appendToFile(String studentName, String yearLevel) throws IOException {


        String studentInfo = yearLevel + " " + studentName;

        FileWriter fw = new FileWriter("Students.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(studentInfo);

        pw.close();

        Scanner inputFile = new Scanner(new File("Students.txt"));

        inputFile.close();

    }
    /*
    *   This method is used to delete all lines in the file
    *   It creates an instance of the PrintWriter class and passes the file as a parameter, and then closes that object
     */
    public static void deleteAllRecords() throws IOException {


        PrintWriter pw = new PrintWriter("Students.txt");
        pw.close();

    }
    /*
    *   This method is used to count what level each student entered in the file is(e.g. Freshman, Sophmore, etc)
    *   It runs a while loop to cycle through each line of the file that is passed as a parameter in the File object 'aFile'
    *   The Scanner class then looks at aFile and cycles through each line there
    *   A series of if statements check if the first character of the line is an F, s, J, or S and adds 1 to the counters for each student level
    *   Finally, it closes the Scanner object and prints out the count for each student level
     */
    public static void countStudents() throws FileNotFoundException {

        int freshCounter = 0;
        int sophCounter =0;
        int junCounter =0;
        int senCounter =0;
        int studentCounter = 0;

        File aFile = new File("Students.txt");

        Scanner inputFile = new Scanner(aFile);

        while (inputFile.hasNext()){
            String sentence = inputFile.nextLine();
            if (sentence.charAt(0) == 'F'){
                freshCounter++;
                studentCounter++;
            }
            if (sentence.charAt(0) == 's'){
                sophCounter++;
                studentCounter++;
            }
            if (sentence.charAt(0) == 'J'){
                junCounter++;
                studentCounter++;
            }
            if (sentence.charAt(0) == 'S'){
                senCounter++;
                studentCounter++;
            }
        }
        inputFile.close();

        System.out.printf("Total Freshman: %d\nTotal Sophmores: %d\nTotal Juniors: %d\nTotal Seniors: %d\nTotal Students: %d\n", freshCounter, sophCounter, junCounter, senCounter, studentCounter);

    }
    /*
    *   This method is used to display a menu of options for the user to pick from and run different parts of the program
     */
    public static void displayMenu()
    {
        System.out.println("Enter a menu choice:" );
        System.out.println("\n1.  Add a student to the file. ");
        System.out.println("2.  Delete the contents of the file.");
        System.out.println("3.  Print out how many seniors, juniors, sophomores, and freshman there are.");
        System.out.println("4.  Exit.");
    }

}
