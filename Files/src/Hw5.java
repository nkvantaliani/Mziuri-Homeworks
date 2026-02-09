import java.io.*;

public class Hw5 {
    public static void main(String[] args) {

        try {
            BufferedReader file1 = new BufferedReader(new FileReader("files/hw4.txt"));
            BufferedReader file2 = new BufferedReader(new FileReader("files/hwCAP.txt"));
            BufferedWriter res = new BufferedWriter(new FileWriter("files/result.txt"));

            res.write("first file");
            res.newLine();

            String line;
            while ((line = file1.readLine()) != null) {
                res.write(line);
                res.newLine();
            }
            res.newLine();
            res.write("second file");
            res.newLine();

            while ((line = file2.readLine()) != null) {
                res.write(line);
                res.newLine();
            }
            file1.close();
            file2.close();
            res.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}

