package lab8;

import java.util.Scanner;

public class GraphicObjectapp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //input r
        System.out.print("Enter r: ");
        double r = sc.nextDouble();

        GraphicObject o1 = new Circle(r);
        o1.findArea();
        System.out.println(o1.area);








    }//main
}//class
