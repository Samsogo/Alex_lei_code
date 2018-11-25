package FILE_Operator.FILE_Byte_Stream;

import java.io.FileOutputStream;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) {
        /*
         * 文件输出流：
         * FileOutputStream
         * 构造器：
         * FileOutputStream(File file)
         * FileOutputStream(String filepath)
         * 上述构造器参数为
         * file:传入的File类型
         * filepath:传入的是文件路径
         * 输出流的特点：文件不存在，会自动创建文件。
         *
         */
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(".//src//a.txt");
            String str = "你好!啊";
            byte[] bytes = str.getBytes("utf-8");
            fos.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(fos!=null)
                    fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
