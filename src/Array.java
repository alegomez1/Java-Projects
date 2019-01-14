public class Array {

    public static void main(String[] args) {

        String[] coolCars = new String[] {"Tesla Model S", "Tesla Model X", "Tesla Model 3"};

        System.out.println(coolCars[0]);
        System.out.println(coolCars[2]);
        System.out.println(coolCars[1]);

        String[] favoriteShows = new String[4]; //The 4 defines the total number of items in the Array
        favoriteShows[0] = "The Office";
        favoriteShows[1] = "Friends";
        favoriteShows[2] = "Parks and Rec";
        favoriteShows[3] = "American Dad";

        System.out.println(favoriteShows[1]); //Prints Friends


    }
}
