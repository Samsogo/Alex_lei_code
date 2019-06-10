package Collection.Exercise.Map_QQlogin;

import java.util.Scanner;

/**
 * Author:Alex_lei
 * Description:Test qq_login
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user1 = new User("AABB","111111");
        User user2 = new User("AACC","222222");
        User user3 = new User("AADD","333333");
        UserService us = new UserService();
        us.save(user1);
        us.save(user2);
        us.save(user3);

        while(true) {
            System.out.println("1--register,2--login,0--exit");
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    register(scanner, us);
                    break;
                case 2:
                    login(scanner, us);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
    public static void register(Scanner scanner,UserService us){
        System.out.println("Please input account and password:");
        String account = scanner.next();
        String password = scanner.next();
        while(us.register(account,password)!=true){
            account = scanner.next();
            password = scanner.next();
        }
    }

    public static void login(Scanner scanner,UserService us){
        System.out.println("Please input account and password:");
        String account = scanner.next();
        String password = scanner.next();
        while(us.login(account,password)!=true){
            account = scanner.next();
            password = scanner.next();
        }
    }
}
