import java.util.Scanner;
public class Lab4b {

// The method getMonth() is used to ask the user what month their birthday is in
// It sets the user's response to a String variable and then returns that variable
    public static String getMonth(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("When is your birthday?");
        String month = keyboard.nextLine();
        return month;
    }

// This method findBirthStone() uses a String parameter that is evaluated in the switch function
// Based on the users response, it sets a String variable called birthStone equal to the corresponding birth stone for that month
// It then returns that birthStone variable

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
                birthStone = "Pearl or Alexandrite"; //white/light purple****
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
                birthStone = "Tourmaline or Opal"; //pink*****
                break;
            case "November":
                birthStone = "Topaz or Citrine"; //orange*******
                break;
            case "December":
                birthStone = "Tanzanite, Zircon, or Turquoise"; //blue*******
                break;
                // For default
            default:
                birthStone = "You did not enter a month";
                break;
        }
        System.out.println("The birthstone for the month of " + month + " is " + birthStone);
        return birthStone;
    }
// This method findStoneColor()
    public static String findStoneColor(String month){

        String birthMonth = month;
        String stoneColor;

        switch (birthMonth){

            case "Garnet":
            case "Ruby":
                stoneColor = "Red";
                break;
            case "Amethyst":
                stoneColor = "Purple";
                break;
            case "Pearl or Alexandrite":
                stoneColor = "Clear or Purple";
                break;
            case "Aquamarine":
            case "Sapphire":
            case "Tanzanite, Zircon, or Turquoise":
                stoneColor = "Blue";
                break;
            case "Peridot":
            case "Emerald":
                stoneColor = "Green";
                break;
            case "Diamond":
                stoneColor = "Clear";
                break;
            case "Tourmaline or Opal":
                stoneColor = "Pink";
                break;
            case "Topaz or Citrine":
                stoneColor = "Orange";
                break;
            default: stoneColor = "You did not enter a month";
        }
        System.out.println("The color of " + birthMonth + " is " + stoneColor);
        return stoneColor;
    }


    public static void main(String[] args) {

        String birthMonth = getMonth();

        String typeOfStone = findBirthStone(birthMonth);

        findStoneColor((typeOfStone));


    }
}


  /*    public static String findStoneColor(String month){

            String birthMonth = month;
            String stoneColor = "";

            switch (birthMonth){

                case "January":
                case "July":
                    stoneColor = "Red";
                    break;
                case "February":
                case "June":
                    stoneColor = "Purple";
                    break;
                case "March":
                case "September":
                case "December":
                    stoneColor = "Blue";
                    break;
                case "August":
                case "May":
                    stoneColor = "Green";
                    break;
                case "April":
                    stoneColor = "Clear";
                    break;
                case "October":
                    stoneColor = "Pink";
                    break;
                case "November":
                    stoneColor = "Orange";
                    break;
                    default: stoneColor = "You did not enter a month";


            }
            System.out.println("The color of your stone for the month of " + birthMonth + " is " + stoneColor);
            return stoneColor;

        }*/