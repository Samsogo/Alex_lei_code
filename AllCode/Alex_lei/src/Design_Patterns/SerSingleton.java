package Design_Patterns;

import org.junit.Test;

import java.io.Serializable;

/**
 * @Author:Alex_lei
 * @Description:
 */
public class SerSingleton implements Serializable {
    private String name;
    private static SerSingleton serSingleton = new SerSingleton();
    public static SerSingleton getInstance(){
        return serSingleton;
    }
    public void setName(String name){
        this.name = name;
    }
    public Object readResolve(){
        return serSingleton;
    }
    @Test
    public void test(){
        SerSingleton s = getInstance();
        SerSingleton s1 = getInstance();
        s.setName("123");
        s1.setName("456");
        if(s==s1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
