import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Hw2 {
    public static void main(String[] args) {

        try (InputStream input = new FileInputStream("files/hw1.txt")) {
            StringBuilder text = new StringBuilder();
            int word;
            while ((word = input.read()) != -1) {
                text.append((char) word);
            }
            String content = text.toString().trim();
            String[] words = content.split("\\s+");

            System.out.println("word count: " + words.length);

        } catch (IOException e) {
            System.out.println("failed");
        }
    }
}
