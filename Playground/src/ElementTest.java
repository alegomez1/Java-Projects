import java.util.Random;
import javax.swing.JOptionPane;

public class ElementTest {


    public static void main(String[] args) {

        method();


    }

    public static void method() {

        //Array of all 30 elements

        String elements[] = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P",
                "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn"};

        //Initializing rand as Random class
        Random rand = new Random();

        //Set a randomElement variable
        int randomElement=0;

        //For loop that repeats 50 times
        for (int x = 0; x<50; x++) {

            //Sets randomElement to a random number between 0-29
            randomElement = rand.nextInt(29);

            //Pops up a message dialog with an element corresponding to the randomElement int
            JOptionPane.showMessageDialog(null, elements[randomElement]);





        }

    }
}
