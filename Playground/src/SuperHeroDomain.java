public class SuperHeroDomain {


    //define your attributes here:

    private String firstName, lastName, superPowers, favoriteColor;


    //define your constructor here:

    //Default constructor

    public SuperHeroDomain() {
        this.firstName = "";
        this.lastName = "";
        this.superPowers = "";
        this.favoriteColor = "";
    }


    //Nondefault constructor
    public SuperHeroDomain(String firstName, String lastName, String superPowers, String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.superPowers = superPowers;
        this.favoriteColor = favoriteColor;
    }




    //define your setters and getters here:


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    //define your toString here:



    @Override
    public String toString() {
        return "SuperHeroDomain{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", superPowers='" + superPowers + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}

