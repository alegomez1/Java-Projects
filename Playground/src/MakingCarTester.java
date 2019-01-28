import java.util.Scanner;
public class MakingCarTester {

    public static MakingCarDomain aNewCar;


    public static void defaultMethod() {
        aNewCar = new MakingCarDomain();
        System.out.println(aNewCar.getColor() + " " + aNewCar.getMake() + " " + aNewCar.getModel());
    }

    public static void nonDefaultMethod() {
        aNewCar = new MakingCarDomain("Tesla" , "Model S", "Red");
        System.out.println(aNewCar.getMake() + " " + aNewCar.getModel() + " " + aNewCar.getColor());
    }

    public static void gatherUserData(){
        Scanner keyboard = new Scanner((System.in));

        System.out.println("What make is your car?");
        String newMake = keyboard.nextLine();

        System.out.println("What model car is it?");
        String newModel = keyboard.nextLine();

        System.out.println("What color is it?");
        String newColor = keyboard.nextLine();

        //Sets the values using nondefault constructor
        aNewCar = new MakingCarDomain(newMake, newModel, newColor);

        System.out.println(aNewCar.getMake() + " " + aNewCar.getModel() + " " + aNewCar.getColor());

    }

    public static void gatherUserDataVersion2(){
        Scanner keyboard = new Scanner((System.in));

        System.out.println("What make is your car?");
        String newMake = keyboard.nextLine();

        System.out.println("What model car is it?");
        String newModel = keyboard.nextLine();

        System.out.println("What color is it?");
        String newColor = keyboard.nextLine();

        //Sets the values using setters
        aNewCar = new MakingCarDomain();
        aNewCar.setMake(newMake);
        aNewCar.setModel(newModel);
         aNewCar.setColor(newColor);



        System.out.println(aNewCar.getMake() + " " + aNewCar.getModel() + " " + aNewCar.getColor());

    }

    public static void printString() {
        aNewCar = new MakingCarDomain();

       System.out.println(aNewCar.toString());
    }




    public static void main(String[] args) {
//         defaultMethod();
//
//         nonDefaultMethod();
//
//         gatherUserData();

         gatherUserDataVersion2();




    }
}
