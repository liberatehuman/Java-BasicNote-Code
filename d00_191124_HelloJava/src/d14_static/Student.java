package d14_static;

public class Student {

    private String name;
    static String room; //同一教室的学生共用static
    private int ID;
    private static int IDCounter=0; //学号计数器，每new一个学生对象，计数器+1

    public Student(){
        this.ID = ++IDCounter; //学号先从0变为1
    }

    public Student(String name) {
        this.name = name;
        this.ID = ++IDCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getIDCounter() {
        return IDCounter;
    }

    public static void setIDCounter(int IDCounter) {
        Student.IDCounter = IDCounter;
    }
}
