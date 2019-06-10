package FILE_Operator.File_Character_Stream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @Author:Alex_lei
 * @Description: Operate BufferedWriter
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(".//src//demo.txt",true);
            osw = new OutputStreamWriter(fos,"utf-8");
            bw = new BufferedWriter(osw);
            for(int i=0;i<1000;i++){
                if(i%100==0){
                    bw.flush();
                }
                bw.write(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(bw!=null){
                    bw.close();
                }
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
