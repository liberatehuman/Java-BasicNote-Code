package D03_ObjectStream.d03_transient;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOS {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "d07_IO//src//D03_ObjectStream//Person_transient.txt"));

        oos.writeObject(new Person("小明", 18));

        oos.close();
    }
}
