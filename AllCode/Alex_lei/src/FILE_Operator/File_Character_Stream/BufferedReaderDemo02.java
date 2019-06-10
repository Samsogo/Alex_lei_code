package FILE_Operator.File_Character_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @Author:Alex_lei
 * @Description: operate BufferedReader
 */
public class BufferedReaderDemo02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        InputStreamReader isr = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(".//src//demo.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = "";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                br.close();
                isr.close();
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
