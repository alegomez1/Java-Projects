
package Challenge4JamesBond;
import java.util.Scanner;


public class JamesBondTester {




    public static void main(String[] args)
    {
        //Add a do-while loop that keeps looping while the user
        //enters either 1 or 2.
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

    public static int displayMenu()
    {
        Scanner keyboard = new Scanner(System.in);

        int userOption =0;

        do
        {
            System.out.println("What option would you like to do?\n1: Encrypt a password\n2: Decrypt a password\n3: Stop spying");
             userOption = keyboard.nextInt();
             return userOption;
        }while (userOption == 0);


        //Display the menu to show:
        // 1.  Encrypt a Password?
        // 2.  Decrypt a Password?
        // 3.  Stop Spying...
        //Get input from user and store in a local variable
        //loop to validate value entered as 1, 2, or 3
        //and if not, keep looping and asking user to enter valid value
        //return value entered
        //temporary
    }

    public static void encryptPassword()
    {
        Scanner keyboard = new Scanner(System.in);
        //1.  Ask user for for to encrypt
        //2.  Instantiate the PasswordEncryption object, passing
        //    it the word and a boolean value of true, meaning encrypt
        //3.  Display the encrypted word to the user.
        //4.  Extra Credit: Before displaying encrypted word,
        //    ask user to guess the encrypted word.  If user guesses
        //    correctly, state "Successfully encrypted…mission accomplished"
        //    If user did not guess correctly, state "Unsuccessfully encrypted...Danger, danger!”
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

    public static void decryptPassword()

    {
        Scanner keyboard = new Scanner(System.in);
        //1.  Ask user for encrypted word to decrypt
        //2.  Instantiate the PasswordEncryption object, passing
        //    it the word and a boolean value of false, meaning decrypt
        //3.  Display the decrypted word to the user.
        //4.  Extra Credit: Before displaying decrypted word,
        //    ask user to guess the decrypted word.  If user guesses
        //    correctly, state "Successfully decrypted…mission accomplished"
        //    If user did not guess correctly, state "Unsuccessfully decrypted...Danger, danger!”
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

    public static void selfDestruct()
    {
        //Advise the user that this program will self-destruct in 5 seconds
        //5 - 4 - 3 - 2 - 1 - 0 Boom!
        System.out.println("This program will self-destruct in 5 seconds\n5\n4\n3\n2\n1\n0\nBoom!");

    }

}
