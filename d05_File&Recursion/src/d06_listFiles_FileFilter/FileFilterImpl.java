package d06_listFiles_FileFilter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        //若是文件，返回 true 给listFiles，再遍历递归...
        if (pathname.isDirectory()) {
            return true;
        }
        //根据后缀是否满足要求，返回 t/f 让 listFiles 决定是否将该 File 对象保存到 File[] 中
        return pathname.toString().toLowerCase().endsWith(".txt");


        //【简写】：并为一步（可以 Lambda），要么...要么...
        //return pathname.isDirectory() || pathname.toString().toLowerCase().endsWith(".txt"));
    }
}
