package FILE_Operator.FILE_Byte_Stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * @Author:Alex_lei
 * @Description: operate BufferOutputStream
 */
public class BufferedOutputStreamDemo02 {
    public static void main(String[] args) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(".//src//demo.txt",true);
            bos = new BufferedOutputStream(fos,100);
            String s = "Hello World";
            byte[] bytes = s.getBytes("utf-8");
            bos.write(bytes);
            bos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(bos!=null&&fos!=null) {
                    bos.close();
                    fos.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
