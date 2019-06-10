package FILE_Operator.File_Character_Stream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @Author:Alex_lei
 * @Description: operate InputStreamReader
 */
public class InputStreamReaderDemo03 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(".//src//demo.txt");
            isr = new InputStreamReader(fis,"utf-8");
            char[] c = new char[1024];
            isr.read(c);
            String str = new String(c);
            System.out.println(str.trim());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fis!=null&&isr!=null){
                    fis.close();
                    System.out.println();
                    isr.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
