public class Playground {
    public static void main(String[] args) {
        System.out.println(abbrevName("Alex Gomez"));
    }

    public static String abbrevName(String name) {
        char[] userName = name.toCharArray();
        char firstInitial = userName[0];

        char secondInitial;
        int spaceIndex=0;
        int nothing =0;

        for (int i = 0; i<userName.length; i++){
            if (userName[i] == ' ') {
                spaceIndex = i;

            } else {
                nothing =i;

            }
        }
        System.out.println(spaceIndex);
        secondInitial = userName[spaceIndex+1];



        name = firstInitial + "." + secondInitial;
       name = name.toUpperCase();
        return name;
    }
}
