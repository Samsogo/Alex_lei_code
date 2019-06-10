package FILE_Operator.File;

import java.io.File;

/**
 * @Author:Alex_lei
 * @Description: operate file
 */
public class FileDemo02 {
    public static void main(String[] args) {
        /*
         * 构造器用来指定路径，但是此路径不一定真实存在
         * 所以，最好的习惯是先判断。
         */
        try{
            File file = new File(".//src//t.txt");
            if(!file.exists()){
                file.createNewFile();
                System.out.println("Successfully");
            }
            boolean flag = file.isFile();//判断指定的file是不是文件。
            boolean flag1 = file.isDirectory();//判断指定的file是不是文件夹。
            System.out.println(flag+"\t"+flag1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
