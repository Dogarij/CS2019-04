package kpliakhanau.lesson3;

import java.util.Scanner;

public class taskB1 {
    public static void main(String[] args) {
        Double d,x1,x2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите три числа");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        d = (double)b*b-4*a*c;
        if (d>0) {
            jopa(d, a, b);
        } else if (d==0){
            x1= (double)(-b)/(2*a);
            System.out.println(x1);
        }
        else {
            System.out.printf("Корней нет");
        }
    }

    private static void jopa(Double d, int a, int b) {
        Double x1;
        Double x2;
        x1= (-b+Math.sqrt(d))/(2*a);
        x2= (-b-Math.sqrt(d))/(2*a);
        System.out.println(x1+" "+x2);
    }
}
