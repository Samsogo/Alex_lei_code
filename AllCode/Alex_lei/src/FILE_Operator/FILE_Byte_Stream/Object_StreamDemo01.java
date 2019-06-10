package FILE_Operator.FILE_Byte_Stream;

import java.io.*;

/**
 * @Author:Alex_lei
 * @Description: Object_Stream operation
 */
public class Object_StreamDemo01 {
    public static void main(String[] args) {
        Person p1 = new Person("Alex",21);
        Person p2 = new Person("Lily",20);
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(".//src//demo.txt");
            fos = new FileOutputStream(".//src/demo.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);//写入文件
            oos.writeObject(p2);//写入文件
            p1.setAge(12);
            ois = new ObjectInputStream(fis);//读取文件
            Person p3 = (Person) ois.readObject();
            System.out.println(p3.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                oos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
//需要实现Serializable接口
class Person implements Serializable{
    private String name;
    transient private int age;

    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
