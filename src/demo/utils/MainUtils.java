package demo.utils;

import demo.domain.User;

import java.util.regex.Pattern;

/**
 * Created by pc on 1/25/16.
 */
public class MainUtils {

    public static boolean checkUsername(String username) {

        if (username == null || username.trim().equals("")) {

            System.out.println("Need a user name.");

            return false;
        }

        return true;
    }

    public static boolean checkPassword(String password) {

        if (password == null) {

            System.out.println("Need a user password.");

            return false;
        }

        if (password.length() < 5 || password.length() > 10) {

            System.out.println("The length of password must between 5 and 10.");

            return false;
        }
        return true;
    }

    public static boolean checkCity(String city) {

        if (city == null) {

            System.out.println("Need a user city.");

            return false;
        }

        if (city.matches("[a-zA-Z]*")) {

            return true;
        }

        System.out.println("Not a valid city");

        return false;
    }

    public static boolean checkMobile(String mobile) {

        if (mobile == null) {

            System.out.println("Need a user mobile.");

            return false;
        }

        if(mobile.matches("\\d{10}")){

            return true;
        }

        System.out.println("Mobile number must 10 digits");
        return false;
    }

    public static boolean checkEmail(String email) {

        if (email == null) {

            System.out.println("Need a user mobile.");

            return false;
        }

        if (email.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")) {

            return true;
        }

        System.out.println("Please enter a valid email.");
        return false;
    }
}
