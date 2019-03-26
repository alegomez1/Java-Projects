package OldStuff;

public class JellyBean
{

    //These are the 3 instance variables of a OldStuff.JellyBean object:
    String flavor;
    String color;
    boolean eatMe;

    /**
     * The purpose of this constructor is to move the parameters passed to the constructor
     * into the instance variables of the OldStuff.JellyBean object  The 2 parameters are:
     * @param aFlavor
     * @param aColor
     */
    public JellyBean(String aFlavor, String aColor)
    {
        //Initialize each of the instance variables of the OldStuff.JellyBean object with the parameters passed to the constructor
        //Then, set eatMe attribute to false
        flavor = aFlavor;
        color = aColor;
        eatMe = false;
    }


    public String getFlavor() {
        return flavor;
    }
    public String getColor(){
        return color;
    }
    public boolean getEatMe() {
        return eatMe;
    }
    public void setFlavor(String aFlavor){
        flavor = aFlavor;
    }
    public void setColor(String aColor){
        color = aColor;
    }
    public void setEatMe(boolean aEatMe){
        eatMe = aEatMe;
    }

    public String toString() {
        return "OldStuff.JellyBean{" +
                "flavor='" + flavor + '\'' +
                ", color='" + color + '\'' +
                ", eatMe=" + eatMe +
                '}';
    }
}