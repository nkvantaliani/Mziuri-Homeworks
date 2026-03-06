// 1 - b
// 2 - a
// 3 - a, b
// 4 - c
// 5 - a,c
// 6 - d
// 7 - c
// 8 - b
// 9 - b
// 10 - c
// 11 - a
// 12 - b
// 13 - a, b, d
// 14 - d,
// 15 - b, c

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String firstName = values[1];
                String lastName = values[2];
                int year = Integer.parseInt(values[3]);
                double avgScore = Double.parseDouble(values[4]);
                ArrayList<String> subjects = new ArrayList<>();
                for(String s : subjects){
                    subjects.add(s);
                }
                Student student = new Student(id,firstName,lastName,year,avgScore,subjects);
                students.add(student);
            }
        }catch (IOException e){
            System.out.println("error");
        }

        try(ObjectOutputStream out = (new ObjectOutputStream(new FileOutputStream("output.txt"))) ){
            out.writeObject(students);
        }catch (IOException e){
            System.out.println("error");
        }

//        try(ObjectInputStream in = (new ObjectInputStream(new FileInputStream("output.txt")))){
//
//        }catch (IOException e){
//            System.out.println("error");
//        }

        Collections.sort(students);

    }
}