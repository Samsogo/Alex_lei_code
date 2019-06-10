package FILE_Operator.Random_Access_File;

import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @Author: Alex_lei
 * @Description: operate RandomAccessFile
 */
public class RandomAccessFileDemo02 {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try{
            byte[] bytes = new byte[]{1,2,3,4,5,6,7};
            raf = new RandomAccessFile(".//src//demo.txt","rw");
            raf.write(bytes);//write to file
            long index = raf.getFilePointer();//get pointer of file
            System.out.println("Pointer:"+index);
            raf.seek(0);
            byte[] byte_1 = new byte[1024];
            int k = raf.read(byte_1);
            System.out.println("sum:"+k);
            System.out.println(Arrays.toString(byte_1));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(raf!=null)
                    raf.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
