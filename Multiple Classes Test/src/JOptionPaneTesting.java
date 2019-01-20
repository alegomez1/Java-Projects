import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class JOptionPaneTesting {
    public static void main(String[] args) {


        /*
       String name, strAge, strRate;
       int age;
       double rate;

       JOptionPane.showMessageDialog(null, "Welcome to Lets Make a Deal!");
       name = JOptionPane.showInputDialog("Please enter your first name:");

       strAge = JOptionPane.showInputDialog("What is your current age? ");
       age = Integer.parseInt(strAge);

       strRate = JOptionPane.showInputDialog("What is your hourly rate? ");
       rate = Double.parseDouble(strRate);

       JOptionPane.showMessageDialog(null, "Hi, " + name + " you are " + age + " years old, and make " + rate + " daily rate.");
       */




        JOptionPane.showMessageDialog(null, "Welcome to this test!\nPress 'ok' to continue");
        JOptionPane.showMessageDialog(null, "Let's go and test some things out");

        String name, strAge, strPayRate;
        int age;
        double payRate;

        name = JOptionPane.showInputDialog("Please enter your name below");

        strAge = JOptionPane.showInputDialog("Please enter how many years you've been on this planet below");
        age = Integer.parseInt(strAge);

        strPayRate = JOptionPane.showInputDialog(String.format("And may I ask %s, how much would you like to be paid an hour?", name));
        payRate = Double.parseDouble(strPayRate);

        //Time to apply conditions

        //If pay is over 30 an hour, and age is under 25, print this

        if (payRate >= 30 && age <= 25) {

            JOptionPane.showMessageDialog(null, String.format("Well %s, according to my superior calculations, " +
                    "it seems to me that at %d, you are too young to be earning $%s an hour", name, age, strPayRate));

    //Can't forget to add null when using showMessageDialog


        } else
            JOptionPane.showMessageDialog(null, String.format("%s, my algorithms have determined that at %d you are in " +
                    "fact eligible to be receiving $%s an hour", name, age, strPayRate));




    }
}
