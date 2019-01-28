import com.sun.codemodel.internal.JOp;

import java.util.Random;
import javax.swing.JOptionPane;

public class ElementTest {


    public static void main(String[] args) {

         askUser();


    }

    public static void askUser() {

        String strOption = JOptionPane.showInputDialog("What would you like to review?" +
                "\n\n1: Element symbol" +
                "\n\n2: Element name");
        int option = Integer.parseInt(strOption);

        if (option == 1) {
            method();
        } else {
            method2();
        }

    }


    public static void method() {

        //Array of all 30 elements

        String elements[] = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P",
                "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn"};

        //Initializing rand as Random class
        Random rand = new Random();

        //Set a randomElement variable
        int randomElement = 0;

        //For loop that repeats 50 times
        for (int x = 0; x < 50; x++) {

            //Sets randomElement to a random number between 0-29
            randomElement = rand.nextInt(29);

            //Pops up a message dialog with an element corresponding to the randomElement int
            JOptionPane.showMessageDialog(null, elements[randomElement]);


        }

    }

    public static void method2() {

        //Array of all 30 elements

        String elements[] = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Flourine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous",
                "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickle", "Copper", "Zinc"};

        //Initializing rand as Random class
        Random rand = new Random();

        //Set a randomElement variable
        int randomElement = 0;

        //For loop that repeats 50 times
        for (int x = 0; x < 50; x++) {

            //Sets randomElement to a random number between 0-29
            randomElement = rand.nextInt(29);

            //Pops up a message dialog with an element corresponding to the randomElement int
            JOptionPane.showMessageDialog(null, elements[randomElement]);


        }
    }

}
