package Quiz1;

import java.util.Scanner;

public class Appstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("กรอกชื่อ: ");
        String n = sc.nextLine();
        System.out.println("กรอก ID: ");
        String I = sc.nextLine();
        System.out.println("กรอก major: ");
        String M = sc.nextLine();


        System.out.print("กรอก subject A: ");
        String A = sc.nextLine();
        double g1 = 0.00;
        if (A.equals("A")) {
            g1 = 4.0;

        } else if (A.equals("B+")) {
            g1 = 3.5;
        } else if (A.equals("B")) {
            g1 = 3.0;
        } else if (A.equals("c+")) {
            g1 = 2.5;
        } else if (A.equals("c")) {
            g1 = 2.0;
        } else if (A.equals("D+")) {
            g1 = 1.5;
        } else if (A.equals("D")) {
            g1 = 1.0;
        } else if (A.equals("D+")) {
            g1 = 1.5;
        } else if (A.equals("F")) {
            g1 = 0.0;
        } else System.out.print("0.00");


        System.out.print("กรอก subject B: ");
        String B = sc.nextLine();
        double g2 = 0.00;
        if (B.equals("A")) {
            g1 = 4.0;

        } else if (B.equals("B+")) {
            g2 = 3.5;
        } else if (B.equals("B")) {
            g2 = 3.0;
        } else if (B.equals("c+")) {
            g2 = 2.5;
        } else if (B.equals("c")) {
            g2 = 2.0;
        } else if (B.equals("D+")) {
            g2 = 1.5;
        } else if (B.equals("D")) {
            g2 = 1.0;
        } else if (B.equals("D+")) {
            g2 = 1.5;
        } else if (B.equals("F")) {
            g2 = 0.0;
        } else System.out.print("0.00");


        System.out.print("กรอก subject C: ");
        String C = sc.nextLine();
        double g3 = 0.00;
        if (C.equals("A")) {
            g3 = 4.0;

        } else if (C.equals("B+")) {
            g3 = 3.5;
        } else if (C.equals("B")) {
            g3 = 3.0;
        } else if (C.equals("c+")) {
            g3 = 2.5;
        } else if (C.equals("c")) {
            g3 = 2.0;
        } else if (C.equals("D+")) {
            g3 = 1.5;
        } else if (C.equals("D")) {
            g3 = 1.0;
        } else if (C.equals("F")) {
            g3 = 0.00;}



         else System.out.print("0.00");
        double gpa = (g1 + g2 + g3) / 3;


                student student = new student(n, I, M, gpa);
                System.out.print(student.showgrade());


            }//main



}//class
