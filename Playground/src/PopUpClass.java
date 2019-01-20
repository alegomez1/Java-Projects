import javax.swing.JOptionPane;

public class PopUpClass {

    public void alertBox() {

        JOptionPane.showMessageDialog(null, "Here is your pop-up box!");
    }

    public void secondAlrtBox(int number) {

        JOptionPane.showMessageDialog(null, "The number you have selected is: " + number);

    }


}
