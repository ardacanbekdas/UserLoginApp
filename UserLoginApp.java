package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class UserLoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String createdUserName, createdPassword, enteredUserName, enteredPassword, renewedPassword, confirmPassword;
        int select;

        System.out.print("Please create your username: ");
        createdUserName = input.nextLine();

        System.out.print("Please create your password: ");
        createdPassword = input.nextLine();

        System.out.println("Your account has been created");

        System.out.print("Please enter your username to log in: ");
        enteredUserName = input.nextLine();

        System.out.print("Please enter your password to log in: ");
        enteredPassword = input.nextLine();

        if (createdUserName.equals(enteredUserName) && createdPassword.equals(enteredPassword)) {
            System.out.println("You have successfully logged into your account.");
        } else {
            System.out.println("Username or password is incorrect!");
            System.out.println("Do you want to reset your password?");
            System.out.println("If your answer is yes, press 1, if your answer is no, press 2.");
            select = input.nextInt();

            input.nextLine();

            if (select == 1) {
                System.out.println("Please enter your renewed password: ");
                renewedPassword = input.nextLine();

                System.out.println("Please confirm your password: ");
                confirmPassword = input.nextLine();

                if (renewedPassword.equals(confirmPassword)) {
                    System.out.println("Your password has been created.");
                } else {
                    System.out.println("Password did not match.");
                }

            } else if (select == 2) {
                System.out.println("Password reset process cancelled");
            } else {
                System.out.println("You have pressed the wrong action.");
            }
        }
        input.close();
    }
}



/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
