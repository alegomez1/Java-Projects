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
        //Add code to take the origWord and encrypt it, storing
        //the encrypted word in encryptWor
    }

    public void decryptEncrypt()
    {
        //Add code to take the encryptWord and decrypt it, storing
        //the original word in orgiWord
    }
}
