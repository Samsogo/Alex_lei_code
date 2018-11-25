package FILE_Operator.FILE_Byte_Stream;

import java.io.FileInputStream;

/**
 * @Author:Alex_lei
 * @Description: operate FileInputStream
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        /*
         * 字节输入流：
         * 构造器：
         * FileInputStream(File file)
         * FileInputStream(String filepath)
         */
        try{
            fis = new FileInputStream(".//src//demo.txt");
            byte[] bytes = new byte[1024];
            int k = fis.read(bytes);
            System.out.println("sum:"+k);
            String s = new String(bytes,"utf-8");
            System.out.println(s.trim());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
