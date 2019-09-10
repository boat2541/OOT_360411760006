package lab7;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("carbrand: ");
        String a = sc.nextLine();

        System.out.println("carcolor: ");
        String b = sc.nextLine();

        System.out.println("carenginesize: " );
        String c = sc.nextLine();

        System.out.println("maxspeed: " );
        String d = sc.nextLine();

        System.out.println("countryoforigin: " );
        String e = sc.nextLine();

        SupeCar car1 = new SupeCar(a,b,c,d,e);
        car1.getSuperCarinfo();


    }//main




}//class
