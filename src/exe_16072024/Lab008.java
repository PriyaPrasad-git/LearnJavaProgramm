package exe_16072024;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Name of the Browser");

        String BrowserName = sc.next();
        BrowserName = BrowserName.toLowerCase();

        switch(BrowserName) {
            case "Chrome":
                System.out.println("Starting the Chrome");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox");
                break;
            default:
            System.out.println("No idea");
            break;
        }
        }
}
