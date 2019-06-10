package FILE_Operator.File_Character_Stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @Author:Alex_lei
 * @Description: OutputStreamWriter Operation
 */
public class OutputStreamWriterDemo04 {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(".//src//demo.txt",true);
            osw = new OutputStreamWriter(fos,"utf-8");
            String name = "Alex_lei";
            osw.write(name);//写出字符串
            char[] c = new char[]{'1','2','3','4'};
            osw.write(c);//写出字符数组
            osw.write(name,1,2);//写出字符串的子串
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(osw!=null){
                    osw.close();
                }
                if(fos!=null){
                    fos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
