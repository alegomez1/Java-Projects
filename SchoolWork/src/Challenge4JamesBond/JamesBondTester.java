
package Challenge4JamesBond;
import java.util.Scanner;


public class JamesBondTester {


    /*
    *   Here in main I've created a do-while loop that will run as long as the user picks either option 1 or 2
    *   Inside the do-while loop is a switch statement that is based on the result of the int menuOption which is returned from the displayMenu() method
     */
    public static void main(String[] args)
    {
        int loop=0;
        do
        {
            int menuOption = displayMenu();
            loop = menuOption;
            switch(menuOption)
            {
                case 1:
                    encryptPassword();
                    break;
                case 2:
                    decryptPassword();
                    break;
                case 3:
                    selfDestruct();
                    break;
            }
        }while (loop == 1 || loop == 2);

    }
    /*
    *   This method is used to ask the user what option the would like to do, input as an int value
    *   It then returns that int
    *   It runs within a do-while loop that validates the user has chosen a valid option
     */
    public static int displayMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        int userOption;

        do
        {
            System.out.println("What option would you like to do?\n1: Encrypt a password\n2: Decrypt a password\n3: Stop spying");
             userOption = keyboard.nextInt();
             return userOption;
        }while (userOption == 0);
    }
    /*
    *   This method is used to encrypt a word that the user gives
    *   After accepting the String userWord as input, it instantiates the PasswordEncryption object, and passes it the userWord and a boolean of true so that it encrypts
    *   For extra credit it asks the user to guess what the encrypted word would be, if then tells them if their guess was correct or incorrect
    *   Finally, it displays what the encrypted word is
     */
    public static void encryptPassword()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What word would you like to encrypt?");
        String userWord = keyboard.nextLine();

        PasswordEncryption passEncrypt = new PasswordEncryption(userWord, true);
        passEncrypt.encryptOrig();

        //Extra credit
        System.out.println("Guess the encrypted word");
        String userGuess = keyboard.nextLine();

        if (userGuess.equals(passEncrypt.getEncryptedWord())){
            System.out.println("Successfully encrypted...mission accomplished!");
        }
        else{
            System.out.println("Unsuccessfully encrypted...Danger danger!");
        }
        System.out.println("The correctly encrypted word is: " + passEncrypt.getEncryptedWord());



    }

    /*
     *   This method is used to decrypt a word that the user gives
     *   After accepting the String userWord as input, it instantiates the PasswordEncryption object, and passes it the userWord and a boolean of false so that it decrypts
     *   For extra credit it asks the user to guess what the decrypted word would be, if then tells them if their guess was correct or incorrect
     *   Finally, it displays what the decrypted word is
     */
    public static void decryptPassword()

    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What encrypted word would you like to decrypt?");
        String userWord = keyboard.nextLine();

        PasswordEncryption passDecrypt = new PasswordEncryption(userWord, false);
        passDecrypt.decryptEncrypt();

        //Extra credit
        System.out.println("Guess the decrypted word");
        String userGuess = keyboard.nextLine();

        if (userGuess.equals(passDecrypt.getOrigWord())){
            System.out.println("Successfully decrypted...mission accomplished!");
        }
        else{
            System.out.println("Unsuccessfully decrypted...Danger danger!");
        }

        System.out.println("The correctly decrypted word is: " + passDecrypt.getOrigWord());
    }
    /*
    *   This method is used to end the program and "self-destruct"
     */
    public static void selfDestruct()
    {
        System.out.println("This program will self-destruct in 5 seconds\n5\n4\n3\n2\n1\n0\nBoom!");
    }

}
