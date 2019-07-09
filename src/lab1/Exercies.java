package lab1;

import java.util.Scanner;

public class Exercies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("จงหาค่าสามเหลี่ยม?");
        System.out.println();

        System.out.print("ค่าฐาน: ");
        int a = scanner.nextInt();


        System.out.print("ค่าสูง: ");
        int y = scanner.nextInt();
        System.out.println("พื้นที่สามเหลี่ยม เท่ากับ: "+(0.5*a*y));







    }//main

}//class
