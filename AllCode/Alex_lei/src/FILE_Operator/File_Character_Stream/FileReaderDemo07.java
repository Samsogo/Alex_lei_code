package FILE_Operator.File_Character_Stream;

import java.io.FileReader;

/**
 * @Author:Alex_lei
 * @Description: operate FileReader
 */
public class FileReaderDemo07 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader(".//src//demo.txt");
            char[] c = new char[1024];
            fr.read(c);
            String str = new String(c);
            System.out.println(str.trim());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
