import java.io.*;
import java.util.Scanner;

public class PracticeReading {

    static Student prevWinner;
    static Student challenger;

    public static void main(String[] args) throws IOException{

    }
    public static void createStudentObjects() throws IOException{
        String name = "";
        String id = "";
        File aFile = new File("student.txt");
        Scanner inFile = new Scanner(aFile);

        //this reads the line on the text file
        // .next breaks off by a space where as .nextLine reads each line
        while (inFile.hasNext()){
            name = inFile.next();
            id = inFile.next();
        }
        prevWinner = new Student();
        prevWinner.setFirstName(name);
        prevWinner.setPantherID(id);

        inFile.close();
    }
}
