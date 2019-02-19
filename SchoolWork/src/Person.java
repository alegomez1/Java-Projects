import java.text.DecimalFormat;
public class Person {

    private String firstName;
    private double  heightInches;
    private double weightPounds;
    private double bmi;

    public Person (String aFirstName, double aHeightInches, double aWeightPounds)
    {
       this.firstName = aFirstName;
       this.heightInches = aHeightInches;
       this.weightPounds = aWeightPounds;
      this.bmi = 0;

    }

    //Create all the getters for the attributes here:
    public String getFirstName()
    {
        return firstName;
    }
    public double getHeightInches(){
        return heightInches;
    }
    public double getWeightPounds(){
        return weightPounds;
    }
    public double getBmi(){
        return bmi;
    }

    //etc.


    //Create all the setters for the attributes here:

    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    public void setHeightInches(Double aHeightInches)
    {
        heightInches = aHeightInches;
    }
    public void setWeightPounds(Double aWeightPounds)
    {
        weightPounds = aWeightPounds;
    }
    public void setBmi(Double aBmi)
    {
        bmi = aBmi;
    }

    //Create the .toString() method here:


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", heightInches=" + heightInches +
                ", weightPounds=" + weightPounds +
                ", bmi=" + bmi +
                '}';
    }

    //Create the calculateBMI() method here, using the following formula:
    //BMI= [weight in pounds / ((height in inches) X (height in inches))] x 703
    public String calculateBMI()
    {
        bmi = ((weightPounds) / ((heightInches * heightInches))) * 703;

        DecimalFormat df = new DecimalFormat("#0.00");

        return df.format(bmi);

    }
}
