import java.util.Scanner;
public class GeometryDriver {

public static GeometricShape geometricObject;
    public static void main(String[] args)
    {
        //In main, define local variables to hold the following data:
        // 1.)  userChoice (from a menu of options, 1 = Circle Perimeter;  2 = Rectangle Perimeter;  3 = Triangle Perimeter
        // 2.)  radius
        // 3.)  side1, side2, and side3
        // 4.)  length, width
        // 5.)  perimeter
        // 6.)  keyboard (a Scanner object)

       // int userChoice;
        double radius;
        double side1, side2, side3;
        double length, width;
        double perimeter;
        Scanner keyboard = new Scanner(System.in);

        int option;

        //Display the following menu

        System.out.println("Welcome to the Geometry Calculator!\n"
                + "In this program we will use a menu to decide what kind of shape we will create.\n"
                + "\n1.Create and Calculate Perimeter of a Circle"
                + "\n2. Create and Calculate Perimeter of a Rectangle"
                + "\n3. Create and Calculate Perimeter of a Triangle");


        //Use a switch statement to determine the option that the user selected.
        //Depending on the option that the user selected, ask the user for the appropriate information needed to create the
        //a specific geometric object.  Then, call the getPerimeter() method to calculate the perimeter for the geometric object created.
        //Print the object created and its perimeter.


        option = keyboard.nextInt();
        //The code below is a default shape, so only 1 sout statement
        //is needed at the end of the switch statement.
        GeometricShape aShape = new GeometricShape(-1, -1);
        switch (option)
        {
            case 1:
                //ask user for the radius
                //re-create a GeometricShape with the radius
                //put logic here to call the perimeter method
                System.out.println("What is the radius of the circle?");
                radius = keyboard.nextDouble();
                geometricObject = new GeometricShape(radius);
                geometricObject.getPerimeter();

                break;
            case 2:
                //ask user for the length and width
                //re-create a GeometricShape with the length and width
                //put logic here to call the perimeter method
                System.out.println("What is the length of the rectangle?");
                length = keyboard.nextDouble();
                System.out.println("What is the width of the rectangle?");
                width = keyboard.nextDouble();
                geometricObject = new GeometricShape(length, width);
                break;
            case 3:
                //ask user for side1, side2, and side3
                //re-create a GeometricShape with the the 3 sides
                //put logic here to call the perimeter method
                System.out.println("What is the length of side1?");
                side1 = keyboard.nextDouble();
                System.out.println("What is the length of side2?");
                side2 = keyboard.nextDouble();
                System.out.println("What is the length of side3?");
                side3 = keyboard.nextDouble();
                geometricObject = new GeometricShape(side1, side2, side3);
                break;
            default:
                //Give message to user that option is not valid.
                System.out.println("That option is not valid");
        }
        //Print the geometric shape and its perimeter

        System.out.println(geometricObject.getPerimeter());
    }

}

