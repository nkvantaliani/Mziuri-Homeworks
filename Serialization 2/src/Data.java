import java.io.*;

public class Data {
    public static void saveContacts(PhoneContact[] contacts){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serialization 2/contacts.txt"))){
            oos.writeObject(contacts);
        }catch (IOException e){
            System.err.println("error");
        }
    }

    public static PhoneContact[] loadContacts(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serialization 2/contacts.txt"))){
            return (PhoneContact[]) ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            return new PhoneContact[30];
        }
    }
}
