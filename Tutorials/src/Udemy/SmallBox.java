package Udemy;

public class SmallBox extends Box {

    private int l;
    private int w;
    public SmallBox(int l, int w){
        //Super allows whatever other constructor to apply here
        super(l,w);
        this.l=l;
        this.w=w;
    }

    //Display box name
    public void displayBoxName(){
        System.out.println("I am the small box class");
    }

    //Display area
    public void printArea(){
        double area = l*w;
        System.out.println("Area is: " + area);
    }
}
