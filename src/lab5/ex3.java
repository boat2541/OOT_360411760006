package lab5;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        int num[][] = new int[2][3];

        num[0][0] = 100;

        System.out.println(num[0][0]);
        System.out.println(num);

        //input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {  //loop row
            for (int j = 0; j < num[i].length; j++) { //loop columns

                System.out.print("enter num[" + i + "][" + j + "]: ");
                num[i][j] = sc.nextInt();

            }
        }
                //display data
                System.out.println("data in array: ");

                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < num[i].length; j++) {
                        System.out.print(num[i][j] + "\t");
                    }
                }












    }//main
}//class
