package FILE_Operator.File;


import java.io.File;

/**
 * @Author:Alex_lei
 * @Description:operate File
 */
public class FileDemo01 {
    public static void main(String[] args) {
        /*
         * 在内存中指定一个路径文件
         *
         * 路径：文件操作系统的路径分隔符不一样
         *      如:window下的  \
         *         linux下的  /
         *      File.separator:常量，会根据不同操作
         *      系统返回不同分隔符。
         * 相对路径:  相对于某一个目录来说的。
         *
         *       .  :表示所在的当前目录
         *       .. ：表示返回上一层目录
         *
         * 绝对路径：（不建议使用）
         *          以根目录为参照物的，也就是需要
         *          从根目录写起。
         *          windows:   c:\a\a.txt
         *          linux:     /home/a.txt
         *
         */
        File file = new File(".//src//Collection");
        /*
         * exists():判断的是指定的路径在硬盘上是否真实存在
         */
        if(file.exists()){
            System.out.println("Name:"+file.getName());
            System.out.println("AbsolutePath:"+file.getAbsolutePath());
        }
        File[] files = file.listFiles();//返回的是此目录下的所有文件和目录
        for(File e:files){
            System.out.println(e.getName());
        }
    }
}
