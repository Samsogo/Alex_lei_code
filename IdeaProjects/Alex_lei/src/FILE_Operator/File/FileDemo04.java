package FILE_Operator.File;

import java.io.File;

/**
 * @Author:Alex_lei
 * @Description: mkdir file
 */
public class FileDemo04 {
    public static void main(String[] args) {
        try{
            File file = new File(".//src",File.separator+"a");
            if(!file.exists()){
                /*
                 * mkdir():只会创建一层目录
                 * mkdirs():会创建多层目录。
                 */
                file.mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
