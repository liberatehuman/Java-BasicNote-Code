package d03_Array;

//【对象数组】：对象类型作为数组的元素。（其实所有类型均可作为数组元素）

public class ArrayPerson {

    public static void main(String[] args) {
        //定义一个数组，存储的是对象类型
        Person[] arrayPerson=new Person[3];

        Person one=new Person("迪丽热巴",25);
        Person two=new Person("古力娜扎",26);
        Person three=new Person("马尔扎哈",30);

        //将每个对象的地址值分别赋给数组每个位置
        arrayPerson[0]=one;
        arrayPerson[1]=two;
        arrayPerson[2]=three;

        System.out.println(arrayPerson[0]); //地址值
        System.out.println(arrayPerson[1]);
        System.out.println(arrayPerson[2]);

        System.out.println(arrayPerson[1].getName()+"今年"+arrayPerson[1].getAge());
    }
}
