import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class tuna extends JFrame {


    private JLabel item1;

    public tuna(){
        //super is the title of the window
        super("The title bar");
        //Default layout
        setLayout(new FlowLayout());

        //Text on the screen
        item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This is going to show up on hover");
        add(item1);


    }
}
