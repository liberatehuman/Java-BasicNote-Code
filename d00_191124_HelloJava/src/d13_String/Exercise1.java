package d13_String;

//【字符串练习1】：定义一个方法，将数组{1,2,3}转换成指定格式的字符串[word1#word2#word3]

public class Exercise1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] array) { //输入的参数是数组，返回值是字符串
        String str = "["; //一开始就可以定义第一个字符

        for (int i = 0; i < array.length; i++) {
            str += "word" + array[i]; //【注意】+号对于字符串的特殊意义！可以拼接！

            if (i < (array.length - 1)) {
                str += "#";
            } else {
                str += "]";
            }
        }
        return str;
    }
}
