import java.io.FileOutputStream;
import java.io.IOException;

public class Hw4 {
    public static void main(String[] args) {

        String text = "Assure polite his real and other figures though. Day age advantages\n" +
                        "and sufficient eating expression traveling. Of on am father by agreed\n" +
                        "supply rather either. Own handsome delicate property mistresses her\n" +
                        "end appetite. Mean are sons too sold nor said. Son share three men\n" +
                        "power by you. Now merits wonder effect garret own.";

        try {
            FileOutputStream file = new FileOutputStream("files/hw4.txt");
            file.write(text.getBytes());
            file.close();

            FileOutputStream capitalFile = new FileOutputStream("files/hwCAP.txt");
            capitalFile.write(text.toUpperCase().getBytes());
            capitalFile.close();


        } catch (IOException e) {
            System.out.println("failed");
        }
    }
}
