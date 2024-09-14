

import java.util.Scanner;

public class passwordAuthenticator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a your password: ");
        String password = scanner.next().toUpperCase();

        boolean isValidate = true;

        if(isValidate(password)){
            isValidate = password.length() < 8 || isValidate == password.length() > 10 && isValidate == 
            password.contains("!, @, #, $, %, ^, &, *, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, ., <, >, ,, -, _, +, /");
            
            if(isValidate){
                System.out.println(" Invalid entry. ");
            } else {
                System.out.println(" You pass! ");

            }
        }         

        scanner.close();
    }

    public static boolean isValidate(String num){
        if(num.equals(null)){
            System.out.println(" Try again. ");
            return false;
        } else {
            return true;        
        }
    }
}