package FILE_Operator.File_Character_Stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @Author:Alex_lei
 * @Description: operate PrintWriter
 */
public class PrintWriterDemo05 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(".//src//demo.txt",true);
            osw = new OutputStreamWriter(fos,"utf-8");
            pw = new PrintWriter(osw,true);
            pw.write("Alex_lei");
            pw.println();
            pw.write("Alex");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                pw.close();
                osw.close();
                if(fos!=null)
                    fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
