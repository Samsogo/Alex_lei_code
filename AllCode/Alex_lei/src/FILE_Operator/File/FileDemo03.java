package FILE_Operator.File;

import java.io.File;
/**
 * @Author:Alex_lei
 * @Description:
 */
public class FileDemo03 {
    public static void main(String[] args) {
        try {
            File f = new File("a");
            System.out.println(!f.isDirectory());
            if(!f.isDirectory()){
                /*
                 * mkdir():创建文件夹的作用
                 */
                boolean flag = f.mkdir();
                System.out.println("创建成功？"+flag);
            }
            /*
             * 构造器
             * File(String parentpath,String childpath)
             */
            File file = new File("a","a.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            System.out.println(file.exists());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
