import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("/Users/alejandrogomez/Desktop/myText.txt");

            writer.write("This is my file\n");
            writer.write("This is the second line");

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
