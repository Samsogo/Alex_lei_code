import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\admin\\Desktop\\Alex_lei_code\\科研训练\\学校名字")));
        PrintWriter pw = new PrintWriter(new File("C:\\Users\\admin\\Desktop\\Alex_lei_code\\科研训练\\a1.txt"));
        String line ="";
        String province="";
        String sql;
        int ans=1;
        while((line=br.readLine())!=null){
            int type1=(int)(Math.random()*3);
            int type2=(int)(Math.random()*3);
            if(line.startsWith("--")){
                province = line.substring(2);
                System.out.println(province);
                continue;
            }
            sql = "insert into School values("+(ans++)+","+"\""+line+"\""+","+"\""+province+"\""+","+type1+","+type2+");";
            pw.println(sql);
        }
        pw.close();
        br.close();
    }
}