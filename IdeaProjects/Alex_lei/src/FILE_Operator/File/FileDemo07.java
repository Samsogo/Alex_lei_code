package FILE_Operator.File;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author:Alex_lei
 * @Description: FileFilter
 */
public class FileDemo07 {
    public static void main(String[] args) {
        File file = new File(".//src/FILE_Operator//File");
        if(file.exists()){
            File[] files = file.listFiles();
            if(files.length>0&&files!=null){
                for(File e:files){
                    System.out.println(e.getName());
                }
            }
        }
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().startsWith("F");
            }
        };
        File[] f = file.listFiles(filter);
        if(f.length>0&&f!=null){
            for(File e:f){
                System.out.println(e.getName());
            }
        }
    }
}
