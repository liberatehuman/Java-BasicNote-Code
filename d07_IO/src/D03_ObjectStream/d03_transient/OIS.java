package D03_ObjectStream.d03_transient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OIS {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "d07_IO//src//D03_ObjectStream//Person_transient.txt"));

        Object obj = ois.readObject();

        ois.close();

        System.out.println(obj);//Person{name='小明', age=0}，age被transient修饰，不可被序列化
    }
}
