package FILE_Operator.Random_Access_File;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @Author: Alex_lei
 * @Description: finish copy context in file
 */
public class RandomAccessFileDemo03 {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        File file = new File(".//src//demo.txt");
        File file1 = new File(".//src//a.txt");
        try{
            byte[] b1 = new byte[1024];
            raf = new RandomAccessFile(file,"r");
            int len = raf.read(b1);
            raf = new RandomAccessFile(file1,"rw");
            raf.write(b1,0,len);
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
