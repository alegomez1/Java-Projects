package Udemy;

public class InheritanceExample2 {

    public static void main(String[] args) {

        //Call Box
        Box box1 = new Box(12, 12);
        box1.displayBoxName();

        SmallBox box2 = new SmallBox(12,13);
        box2.displayBoxName();
        box2.printArea();

        BigBox box3 = new BigBox(12,13,14);
        box3.displayBoxName();
        box3.printArea();

    }
}
