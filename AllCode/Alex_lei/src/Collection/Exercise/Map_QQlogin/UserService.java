package Collection.Exercise.Map_QQlogin;


import java.util.HashMap;
import java.util.Map;

/**
 * Author:Alex_lei
 * Description:Create a class name UserService used service
 */
public class UserService {
    private Map<String,String> map;

    public UserService(){
        map = new HashMap<>();
    }

    public boolean register(String account,String password){
        if(account==null){
            System.out.println("Please input account:");
            return false;
        }else if(password==null){
            System.out.println("Please input password:");
            return false;
        }
        else if(map.containsKey(account)){
            System.out.println("The account is exist,please input another account:");
            return false;
        }else{
            map.put(account,password);
            System.out.println("Register successfully");
            map.put(account,password);
            return true;
        }
    }

    public boolean login(String account,String password){
        if(account==null) {
            System.out.println("Please input effective account");
            return false;
        }else if(password==null) {
            System.out.println("Please input effective password");
            return false;
        }else if(map.containsKey(account)&&!map.get(account).equals(password)){
            System.out.println("Please input correct password");
            return false;
        }else if(!map.containsKey(account)){
            System.out.println("Your account is not exists");
            return false;
        }else{
            System.out.println("login successfully");
            return true;
        }
    }

    public void save(User user){
        map.put(user.getAccount(),user.getPassword());
    }
}
