public class StringInterpolation {

    public static void main(String[] args) {


        String custName = "Jim";
        int age = 44;
        String streetName = "1 Infinite Loop";
        String city= "Silicon Valley";
        String state = "California";
        String country = "USA";
        String zipCode = "33165";

        //No String Interpolation
        System.out.println(String.format("Student Details: name: %s, age: %d, Address: %s, City: %s," +
                "State: %s, Country: %s, ZipCode: %s", custName, age, streetName, city, state, country, zipCode));

    }
}
