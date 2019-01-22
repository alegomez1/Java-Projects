import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class CondOperator {

    public static void testMethod() {


        String strCar = JOptionPane.showInputDialog("What car do you wanna drive?" +
                "\n1: Tesla" +
                "\n2: Chevy");

        int car = Integer.parseInt(strCar);

        JOptionPane.showMessageDialog(null, car == 1 ? "Going electric, how nice!" : "Back to the old ICE, how barbaric...");



    }



    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = kb.nextInt();
        System.out.println(age >= 50 ? "You are old" : "You are young");

        testMethod();






    }
}
