package Challenge4JamesBond;

public class PasswordEncryption {
    String origWord;
    String encryptWord;

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

    public void encryptOrig()
    {
        String spyMessage = origWord.toLowerCase();

        String scrambledMessage = "";
        char letter, newLetter;

        int newLetterNum;

        for (int i =0; i<spyMessage.length();i++){
            letter = spyMessage.charAt(i);
            //insert code for xyz
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

        System.out.println(spyMessage);
        System.out.println(scrambledMessage);
        encryptWord = scrambledMessage;




        //Add code to take the origWord and encrypt it, storing
        //the encrypted word in encryptWord
    }

    public void decryptEncrypt()
    {
        String wordToDecrypt = getEncryptedWord();
        String newMessage = "";

        char letter, newLetter;
        int newLetterNum;

        for (int i =0;i<wordToDecrypt.length();i++){
            letter = wordToDecrypt.charAt(i);
            //insert code for xyz
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

        System.out.println(wordToDecrypt);
        System.out.println(newMessage);
        origWord = newMessage;
        //Add code to take the encryptWord and decrypt it, storing
        //the original word in orgiWord
    }
}
