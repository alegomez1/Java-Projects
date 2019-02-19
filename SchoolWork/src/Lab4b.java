import java.util.Scanner;
public class Lab4b {

/*
    The method getMonth() is used to ask the user what month their birthday is in
    It sets the user's response to a String variable and then returns that variable
 */
    public static String getMonth(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("When is your birthday?");
        String month = keyboard.nextLine();
        return month;
    }

/*
    This method findBirthStone() uses a String parameter that is evaluated in the switch function
    Based on the users response, it sets a String variable called birthStone equal to the corresponding birth stone for that month
    It then returns that birthStone variable
 */

    public static String findBirthStone(String month) {

        String birthStone;
        switch (month) {

            case "January":
                birthStone = "Garnet"; //red******
                break;
            case "February":
                birthStone = "Amethyst"; //purple******
                break;
            case "March":
                birthStone = "Aquamarine"; //blue*****
                break;
            case "April":
                birthStone = "Diamond"; //clear*********
                break;
            case "May":
                birthStone = "Emerald"; //green********
                break;
            case "June":
                birthStone = "Pearl"; //white****
                break;
            case "July":
                birthStone = "Ruby"; //red********
                break;
            case "August":
                birthStone = "Peridot"; //lime green*******
                break;
            case "September":
                birthStone = "Sapphire"; //blue******
                break;
            case "October":
                birthStone = "Opal"; //pink*****
                break;
            case "November":
                birthStone = "Topaz"; //orange*******
                break;
            case "December":
                birthStone = "Turquoise"; //blue*******
                break;
                // For default
            default:
                birthStone = "You did not enter a month";
                break;
        }
        return birthStone;
    }
/*
    This method findStoneColor() takes a String parameter 'month' to be evaluated in the switch function
    It also declares a String variable 'stoneColor' that is changed to equal the color of the birth stone, based on the case
    It the returns the 'stoneColor' variable
 */
    public static String findStoneColor(String month){

        String stoneColor;

        switch (month){

            case "Garnet":
            case "Ruby":
                stoneColor = "Red";
                break;
            case "Amethyst":
                stoneColor = "Purple";
                break;
            case "Pearl":
                stoneColor = "White";
                break;
            case "Aquamarine":
            case "Sapphire":
            case "Turquoise":
                stoneColor = "Blue";
                break;
            case "Peridot":
            case "Emerald":
                stoneColor = "Green";
                break;
            case "Diamond":
                stoneColor = "Clear";
                break;
            case "Opal":
                stoneColor = "Pink";
                break;
            case "Topaz":
                stoneColor = "Orange";
                break;
            default: stoneColor = "You did not enter a month";
        }
        return stoneColor;
    }

/*
    Here in main I am calling all three methods
    The getMonth() method is set equal to a String variable called 'birthMonth'
    This 'birthMonth' variable is then passed into the findBirthStone() method as a parameter
    The findBirthStone() method is set equal to a String variable called 'typeOfStone'
    This 'typeOfStone' variable is then passed into the findStoneColor() method as a parameter
    Finally, it prints a sentence showing each individual value depending on what the user said their birth month is
 */
    public static void main(String[] args) {

        String birthMonth = getMonth();

        String typeOfStone = findBirthStone(birthMonth);

        String stoneColor = findStoneColor((typeOfStone));

        System.out.printf("You were born in %s and your birthstone is %s and the color of your birthstone is %s" , birthMonth, typeOfStone, stoneColor);

    }
}
