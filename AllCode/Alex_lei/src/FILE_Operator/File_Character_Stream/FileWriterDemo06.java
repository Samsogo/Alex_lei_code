package FILE_Operator.File_Character_Stream;

import java.io.FileWriter;

/**
 * @Author:Alex_lei
 * @Description: operate FileWriter
 */
public class FileWriterDemo06 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter(".//src//demo.txt",true);
            fw.append('c');
            fw.append('\n');
            fw.append("s");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
