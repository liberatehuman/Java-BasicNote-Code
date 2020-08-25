package D03_ObjectStream.d04_serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OIS {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "d07_IO//src//D03_ObjectStream//Person_UID.txt"));

        Object obj = ois.readObject();//若序列号不一致：InvalidClassException

        ois.close();

        System.out.println(obj);
    }
}
