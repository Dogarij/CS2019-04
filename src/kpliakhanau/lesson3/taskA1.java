package kpliakhanau.lesson3;

import java.util.Scanner;

public class taskA1 {

    public static void main(String[] args) {
        double x1,y1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите два числа ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        x1=x;
        y1=y;
        System.out.println(x+y+" "+(x-y)+" "+x*y+" "+x/y+" "+x%y);
        System.out.println(x1+y1+" "+(x1-y1)+" "+x1*y1+" "+x1/y1+" "+x1%y1);
    }
}
