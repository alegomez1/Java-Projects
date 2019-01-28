public class MakingCarDomain {


    private String make, model, color;

    //Default constructor
    public MakingCarDomain() {
        this.make = "Chevy";
        this.model = "Malibu";
        this.color = "Silver";


    }

    //NonDefault construct
    public MakingCarDomain(String aMake, String aModel, String aColor) {
        this.make = aMake;
        this.model = aModel;
        this.color = aColor;
    }

    //Getters and Setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString()

    @Override
    public String toString() {
        return "MakingCarDomain{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
