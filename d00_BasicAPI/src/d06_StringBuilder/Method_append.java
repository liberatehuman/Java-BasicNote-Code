package d06_StringBuilder;

/*

public StringBuilder append(.)：可添加【任意类型】数据的字符串形式，返回【当前对象本身】

*/

public class Method_append {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = sb.append("abc");//append 返回的是【this】，所以相当于把 sb 的地址赋给 sb1
        //一般不需要被接收（因为返回的是 this，即 StringBuilder 本身）
        System.out.println(sb1);

        System.out.println(sb == sb1);//比较的是地址值

        //append可链式编程：返回的是一个对象，可以继续调用方法
        sb.append(8).append(-1.5).append(true).append("嗨");
        System.out.println(sb);

    }
}
