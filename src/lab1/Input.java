package lab1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("what's your name?: ");
        String name = scanner.nextLine();

        System.out.println(name);

        System.out.print("กรุณากรอกอายุ? : ");
        int a = scanner.nextInt();
        System.out.print(a);

        System.out.print("กรอก e-mall ? : ");
        String e = scanner1.nextLine();
        System.out.println(e);










    }//main




}//class
