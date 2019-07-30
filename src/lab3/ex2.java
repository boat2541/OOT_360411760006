package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int  x ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric test score and I will tell\n" +
                "you the grade:");
        x = sc.nextInt();

        if (x<=49.99)
        System.out.print("เกรด F ");

        else if (x<=54.99)
        System.out.println("เกรด D ");
        else if (x<=59.99)
        System.out.println("เกรด D+ ");
        else if (x<=54.99)
        System.out.println("เกรด C ");
        else if (x<=69.99)
        System.out.println("เกรด C+ ");
        else if (x<=74.99)
        System.out.println("เกรด B ");
        else if (x<=79.99)
        System.out.println("เกรด B+ ");
        else if (x>=80)
        System.out.println("เกรด A ");










    }//main
}//class
