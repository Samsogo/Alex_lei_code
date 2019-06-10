package FILE_Operator.Random_Access_File;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @Author: Alex_lei
 * @Description: use RandomAccessFile write to file
 */
public class RandomAccessFileDemo01 {
    public static void main(String[] args) {
        File file = null;
        RandomAccessFile raf = null;

        try {
            file = new File("demo.txt");
            raf = new RandomAccessFile(file,"rw");
            int max = Integer.MAX_VALUE;
            raf.write(max);
            raf.write(max>>>2);
            System.out.println(raf.read());
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(raf!=null){
                    raf.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
