package FILE_Operator.File;

import java.io.File;

/**
 * @Author:Alex_lei
 * @Description: mkdir and delete file
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File file = new File(".//src//a.txt");
        if(file.exists()){
            /*
             * delete():
             * 当构造器指定的路径是单层时。
             * 如果是文件，会直接删除。
             * 如果是目录，目录下为空，可以直接删除
             *            目录不为空，删除失败
             *
             * 当构造器指定的路径是多层时。
             * 最后一层是文件，只会删除此文件
             * 最后一层是目录，
             *         目录为空时，只会删除之后一层
             *         目录不为空时，删除失败
             *
             *
             * 删除逻辑：先删最里层，里层删完之后，才能删上一层。
             *
             *
             *
             */
            file.delete();
        }
        file = new File(".//src//b.txt");
        if(!file.exists()){
            file.mkdir();
            System.out.println(file.delete());
        }
    }
}
