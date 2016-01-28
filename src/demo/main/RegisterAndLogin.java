package demo.main;

import demo.dao.UserDao;
import demo.dao.UserDaoImpl;
import demo.domain.User;
import demo.utils.MainUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pc on 1/25/16.
 */
public class RegisterAndLogin {

    private static UserDao dao = null;
    private static Scanner sc = null;
    private static User user = null;
    private static int option;
    private static int option2;
    private static String username;
    private static String password;
    private static String city;
    private static String mobile;
    private static String email;

    public static void main(String[] args) {
        while (option != 3) {
        sc = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("SYSTEM");
        System.out.println();
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("3-Exit");
        System.out.println("*****************************************");
        System.out.println();
        System.out.print("Choose your option: ");

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }

            if (option == 1) {

                sc.nextLine();
                while(!MainUtils.checkUsername(username)) {

                    System.out.print("username: ");
                    username = sc.nextLine();
                }
                while(!MainUtils.checkPassword(password)){

                    System.out.print("password: ");
                    password = sc.nextLine();
                }
                while(!MainUtils.checkCity(city)){

                    System.out.print("city: ");
                    city = sc.nextLine();
                }
                while(!MainUtils.checkMobile(mobile)){

                    System.out.print("mobile: ");
                    mobile = sc.nextLine();
                }
                while(!MainUtils.checkEmail(email)){

                    System.out.print("email: ");
                    email = sc.nextLine();
                }

                user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setCity(city);
                user.setMobile(mobile);
                user.setEmail(email);

                dao = new UserDaoImpl();
                try{
                    dao.add(user);
                }
                catch (Exception e){

                    System.out.println("*****************************************");
                    System.out.println("User already exist.");
                    continue;
                }

                System.out.println("*****************************************");
                System.out.println("Register successed!");
            } else if (option == 2) {

                sc.nextLine();
                System.out.print("username: ");
                String username = sc.nextLine();
                System.out.print("password: ");
                String password = sc.nextLine();

                dao = new UserDaoImpl();
                User user = dao.get(username, password);

                if (user == null) {

                    System.out.println("*****************************************");
                    System.out.println("User doesn't exist or password incorrect.");
                    continue;
                }

                while(option==2) {

                    System.out.println("*****************************************");
                    System.out.println("Welcome " + user.getUsername()+"!");
                    System.out.println();
                    System.out.println("1-show profile");
                    System.out.println("2-log out");
                    System.out.println("*****************************************");
                    System.out.print("Enter your choice:");

                    try {
                        option2 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        option2 = 0;
                    }

                    if (option2 == 1) {

                        System.out.println("*****************************************");
                        System.out.println("User Profile");
                        System.out.println();
                        System.out.println("username: " + user.getUsername());
                        System.out.println("password: " + user.getPassword());
                        System.out.println("city: " + user.getCity());
                        System.out.println("mobile: " + user.getMobile());
                        System.out.println("email: " + user.getEmail());
                    } else if (option2 == 2) {

                        break;
                    } else {

                        System.out.println("Please enter a valid number.");
                    }
                }
            }else if(option==3){

                System.out.println("Bye Bye!");
            }
            else {

                System.out.println("Please enter a valid number.");
            }

        }
    }
}
