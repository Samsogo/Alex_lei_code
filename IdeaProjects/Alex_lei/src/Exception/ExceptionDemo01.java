package Exception;

import java.util.Scanner;

/**
 * @Author:Alex_lei
 * @Description:Exception of NUllPointer
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String s = scanner.next();
            char c = s.charAt(10);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            System.out.println("NULL");
        }
    }
}
