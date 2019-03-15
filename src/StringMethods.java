public class StringMethods {

    public static void main(String[] args) {

        String str1 = "Hello world";
        String str2 = "Welcome";
        String str3 = "";
        String str4 = "Full";
        String str5 = "abc, def, ghi";;
        String str6 = "        So much space        ";
        int totalPoints = 100;

        System.out.println(str1.length()); //gives length
        System.out.println(str1.substring(1)); //starts at given index
        System.out.println(str1.substring(1,6)); //starts and end between index range
        System.out.println(str1.contains("Hello")); //returns boolean if String contains text
        System.out.println(str2.equals("welcome")); //returns boolean if String equals text exactly
        System.out.println(str2.equalsIgnoreCase("welcome")); //returns boolean if String equals text
        System.out.println(str3.isEmpty()); //returns boolean if empty or not
        System.out.println(str4.isEmpty()); //returns boolean if empty or not

        System.out.println(str1.concat(" ").concat(str2)); //Joins Strings together
        System.out.println(str1.replace('l', 'y')); //replaces one char with another
        System.out.println(str6.trim()); //trims white space
        System.out.println(String.valueOf(totalPoints)); //Parse int to String
        System.out.println(str1.toUpperCase()); //All text to uppercase
        System.out.println(str1.toLowerCase()); //All text to lowercase


    }
}
