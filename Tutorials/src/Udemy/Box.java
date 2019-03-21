package Udemy;

public class Box {

    //Variables
    private int length;
    private int width;

    public Box(int l, int w){
        this.length =l;
        this.width = w;
    }

    //Display box name
    public void displayBoxName(){
        System.out.println("I am the parent box class");
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
