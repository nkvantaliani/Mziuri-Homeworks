import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Hw1 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/hw1.txt"))) {

            writer.write("შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,");
            writer.newLine();
            writer.write("კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;");
            writer.newLine();
            writer.write("კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,");
            writer.newLine();
            writer.write("ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.");

        } catch (IOException e) {
            System.out.println("failed");
        }
    }
}

