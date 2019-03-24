
public class CountingLetters {

    public static void main(String[] args) {

       test();

    }

    //counts the number of letter a's
    public static void countAs(){
        String name = "catamaran";
        int countA=0;
        int location=0;

        while (location<name.length() && location!=-1){
            location = name.indexOf("a", location);
            if (location!=-1){
                countA++;
                location++;
            }
        }
        System.out.println(countA);
    }

    //using for loop
    public static void count2(){
        String name = "catamaran";
        int countA=0;

        for (int i=0; i<name.length();i++){
            if (name.charAt(i) == 'a'){
                countA++;
            }
        }
        System.out.println(countA);
    }

    public static void test(){
        String word = "Supercalifragilisticexpialidocious";

        //Getting the length of the word
        System.out.println(word.length());

        //Write the instruction to get “fragil” from the word above.
        System.out.println(word.substring(9,15));

        //Write the instruction to get “docious” from the word above.
        System.out.println(word.substring(27));

        //Write the instruction that will return the last char of ‘r’ from the word above.
        System.out.println(word.charAt(10));

        //Write the instruction that will print out the first  location of the letter ‘e’
        System.out.println(word.indexOf("e", 1));

        //Write the instruction that will print out the second location of the letter ‘e’
        System.out.println(word.indexOf("e", 6));

        //Write the instruction that will print out the word all in upper case
        System.out.println(word.toUpperCase());

    }



}
