package D03_ObjectStream.d04_serialVersionUID;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOS {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "d07_IO//src//D03_ObjectStream//Person_UID.txt"));

        oos.writeObject(new Person("小明", 18));

        oos.close();
    }
}
