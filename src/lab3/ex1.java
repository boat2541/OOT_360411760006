package lab3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        //if
        System.out.print("enter an integer: ");
        x = sc.nextInt();

//        if (x % 2 ==0)
//            System.out.println("this number is even.");
//            System.out.println("good bye.");

        //if-else
        if (x % 2 == 0 && x % 4 ==0) {
            System.out.println("this number is even.");

        } else {
            System.out.println("this number is odd.");
            System.out.println("good bye");
        }








    }//main
}//class
