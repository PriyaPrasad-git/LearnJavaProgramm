package exe_16072024;

import java.util.Scanner;

public class lab0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Name of the vowel");

        char user_input = sc.next(). charAt(0);
        System.out.println("user_input");

        switch(user_input){
        case 'a','u','i','e':
               System.out.println("vowel");
              break;
            default:
                System.out.println("none");


        }
    }
}
