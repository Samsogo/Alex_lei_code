package FILE_Operator.File;

import java.io.File;

/**
 * @Author:Alex_lei
 * @Description: see the attribute of file
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File file = new File(".//src//a//a.txt");
        if(!file.exists()){
            file.mkdirs();
        }
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(file.isHidden());
    }
}
