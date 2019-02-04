import java.util.Scanner;
import javax.swing.JOptionPane;
public class testing {

    public static void main(String[] args) {


        getContactInfo();
        double price = findFavoritePrice();
        System.out.println("Your favorite thing to buy on Amazon is " + favItem + " and the original price is " + price);
        double halfPrice = getDiscountedPrice(price);
        System.out.println("The discounted price is " + price);


    }

    public static void getContactInfo()
    {
        String name, strAge, strRate;
        int age;
        double rate;

        JOptionPane.showMessageDialog(null, "Welcome to Lets Make a Deal!");
        name = JOptionPane.showInputDialog("Please enter your first name:");

        strAge = JOptionPane.showInputDialog("What is your current age? ");
        age = Integer.parseInt(strAge);

        strRate = JOptionPane.showInputDialog("What is your hourly rate? ");
        rate = Double.parseDouble(strRate);

        JOptionPane.showMessageDialog(null, "Hi, " + name + " you are " + rate + " years old, and make " + age + " daily rate.");

    }


    public static double findFavoritePrice()
    {
        double favPrice;
        String favItem, strPrice;
        //ask user for their favorite item to buy at Amazon
        favItem = JOptionPane.showInputDialog("What is your fav item to buy on Amazon?");

        //ask user for the price of their favorite item to buy at Amazon
        strPrice = JOptionPane.showInputDialog("What is the price of " + favItem);
        favPrice = Double.parseDouble(strPrice);
        return favPrice;
    }

    public static double getDiscountedPrice(double price)
    {
        double discounted = price * 2;
        return price;
    }

}


/*
public class testing {

    public static void main(String[] args) {

        String[] name = new String[5];
        Scanner keyboard = new Scanner(System.in);
        name[0] = "Jake";


        for (int x = 0; x<name.length; x++){

            System.out.println("Enter a name");
            name[x] = keyboard.nextLine();

        }


        System.out.printf("%s \t%s \t %s \t %s \t %s ", name[0], name[1], name[2], name[3], name[4]);


    }
}*/
