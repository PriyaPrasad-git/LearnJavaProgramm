package exe_16072024;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the day between 1 to 7, tell me what is the day it is");

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
            case 3:
                System.out.println("WED");
            case 4:
                System.out.println("THU");
            case 5:
                System.out.println("FRI");
            case 6:
                System.out.println("SAT");
            case 7:
                System.out.println("SUN");
            default:
                System.out.println("No idea what day it is");

        }

    }
}
