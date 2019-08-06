package lab4;

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r;


        System.out.print("Enter integer 1: ");
        r = sc.nextInt();

        double mac = r(r);
        double an = an(r);
        double vn = vn(r);

        System.out.println("ค่ารัศมี " +mac);
        System.out.println("ค่าพื้นที่ " +an);
        System.out.println("ค่าปริมาตร " +vn);


    }//main

    private static double vn(double r) {
        double pi = 3.141;
        return (4/3*pi*r*r*r);
    }

    private static double an(double r) {
        double pi = 3.141;
        return (2*r*r);
    }

    private static double r(double r) {
        double pi = 3.141;

        return (2*pi*r);
    }


}//class
