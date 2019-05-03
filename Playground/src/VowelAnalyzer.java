import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
public class VowelAnalyzer {
    public static void main(String[] args) {

        vowelAnalyzer();

    }

    public static void vowelAnalyzer(){
        JOptionPane.showMessageDialog(null, "Welcome to the Vowel Analyzer 5000!");

        String userInput = JOptionPane.showInputDialog(null, "Please enter a word or sentence");

        char[] arrayOfInput = userInput.toCharArray();

        int vowelCounter =0;
        int otherCounter =0;

        for (int i = 0; i<arrayOfInput.length; i++){
            if ((arrayOfInput[i] == 'a') || (arrayOfInput[i] == 'e') || (arrayOfInput[i] == 'i') ||
                    (arrayOfInput[i] == 'o') || (arrayOfInput[i] == 'u')){
                vowelCounter ++;
            }
            else if ((arrayOfInput[i] == 'A') || (arrayOfInput[i] == 'E') || (arrayOfInput[i] == 'I') ||
                    (arrayOfInput[i] == 'O') || (arrayOfInput[i] == 'U')){
                vowelCounter ++;
            }
            else {
                otherCounter++;

            }
        }

        JOptionPane.showMessageDialog(null, "Your word/phrase: '" + userInput + "' contains the following: " +
        "\nVowels: " + vowelCounter + "\nNon-vowels: " + otherCounter);


    }
}
