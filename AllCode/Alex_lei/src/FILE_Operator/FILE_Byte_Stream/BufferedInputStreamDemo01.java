package FILE_Operator.FILE_Byte_Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @Author:Alex_lei
 * @Description: operate BufferInputStream
 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(".//src//demo.txt");
            bis = new BufferedInputStream(fis);
            byte[] bytes = new byte[1024];
            int ans = bis.read(bytes);
            System.out.println(ans);
            String str = new String(bytes,"utf-8");
            System.out.println(str.trim());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(bis!=null)
                    bis.close();
                if(fis!=null)
                    fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
