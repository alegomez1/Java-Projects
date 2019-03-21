package Udemy;

public class BigBox extends Box {

    private int l;
    private int w;
    private int height;
    public BigBox(int l, int w, int h){
        //Super allows whatever other constructor to apply here
        super(l,w);
        this.l=l;
        this.w=w;
        this.height = h;
    }

    //Display box name
    public void displayBoxName(){
        System.out.println("I am the big box box class");
    }

    //Display area
    public void printArea(){
        double area = l*w*height;
        System.out.println("Area is: " + area);
    }
}
