package Challenge4JamesBond;

public class PasswordEncryption {
    //These are the two variables that get changed around during the program
    String origWord;
    String encryptWord;

    //This is the constructor which takes two parameters
    public PasswordEncryption(String word, boolean encrypt)
    {
        if (encrypt)
        {
            this.origWord = word;
            this.encryptWord = "";
        }
        else
        {
            this.encryptWord = word;
            this.origWord = "";
        }
    }

    //These are the getters and setters, as well as the toString() method to show what the values of the variables are
    public String getOrigWord() {
        return origWord;
    }

    public void setOrigWord(String origWord) {
        this.origWord = origWord;
    }

    public String getEncryptedWord() {
        return encryptWord;
    }

    public void setEncryptedWord(String encryptWord) {
        this.encryptWord = encryptWord;
    }

    public String toString()
    {
        return "Original Word: " + origWord + "\nEncrypted Word:" + encryptWord;
    }

    /*
    *   This method is used to encrypt the word that gets passed into the constructor
    *   First, it converts the String spyMessage into lowercase to make it easier to work with
    *   Then it defines the variables that will be used during the method
    *   It runs a for-loop for the length of spyMessage
    *   In the loop it first checks to see if the letter is x, y, or z, then hard codes those to be a, b, or c respectively
    *   Then it changes all other letters into their ascii number values by casting them, and adds 3 to their value in order to encrypt it
    *   Then it converts it back to a letter and adds it to the scrambledMessage variable
    *   Finally, it sets the encryptWord variable equal to the scrambled message
     */
    public void encryptOrig()
    {
        String spyMessage = origWord.toLowerCase();

        String scrambledMessage = "";
        char letter, newLetter;

        int newLetterNum;

        for (int i =0; i<spyMessage.length();i++){
            letter = spyMessage.charAt(i);

            if (letter == 'x'){
                newLetter = 'a';
            }
            else if (letter == 'y'){
                newLetter = 'b';
            }
            else if (letter == 'z'){
                newLetter ='c';
            }

            else{
                newLetterNum = ((int) letter) +3;
                newLetter = (char)newLetterNum;
            }
            scrambledMessage += newLetter;

        }
        encryptWord = scrambledMessage;

    }
    /*
    *   This method is used to decrypt the word that gets passed into the constructor
    *   First, it sets the String wordToDecrypt equal to what the encryptedWord is
    *   Then it defines the variables that will be used in the method
    *   It uses a for-loop that runs the length of the wordToDecrypt
    *   In the loop, it looks at each letter and first checks to see if they are an a, b, or c, and hard codes them to equal x, y, or z respectively
    *   Otherwise it converts the letters to numbers using their ascii values and subtracts 3 in order to decrypt the message, then converts the number back to a letter
    *   This letter is then added to the newMessage String variable
    *   Finally, the origWord variable is set equal to the newMessage variable
     */
    public void decryptEncrypt()
    {
        String wordToDecrypt = getEncryptedWord();
        String newMessage = "";

        char letter, newLetter;
        int newLetterNum;

        for (int i =0;i<wordToDecrypt.length();i++){
            letter = wordToDecrypt.charAt(i);

            if (letter == 'a'){
                newLetter = 'x';
            }
            else if (letter == 'b'){
                newLetter = 'y';
            }
            else if (letter == 'c'){
                newLetter ='z';
            }

            else{
                newLetterNum = ((int) letter) -3;
                newLetter = (char)newLetterNum;
            }

            newMessage += newLetter;

        }
        origWord = newMessage;

    }
}
