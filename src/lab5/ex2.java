package lab5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num[] = new int[5];

        //input
        num = inputData (num);
        //output
        prinData(num);
        //หาค่าผลรวม
        asd(num);



    }//main

    private static void asd(int[] num) {
        int total=0;
        for (int val:num) {
            total += val;
        }
        System.out.println("total: "+total);
        System.out.println("average: "+total/num.length);


    }

    private static void prinData(int[] num) {
        System.out.println("Data in array:");
        for (int val:num) {
            System.out.print(val+"");
        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("enter integer: ");
            num[i] = sc.nextInt();
        }
        return num;

    }


}//class
