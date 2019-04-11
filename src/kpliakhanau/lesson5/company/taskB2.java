package kpliakhanau.lesson5.company;

import java.util.Arrays;
import java.util.Scanner;

public class taskB2 {
    public static void main(String[] args) {
        int [] list=new int[20];
        int [] a=new int[10];
        int [] b=new int [10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 20 чисел ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        for (int i =0 ; i<10;i++){
            a[i]=list[i];
            b[i]=list[i+10];
        }
        System.out.println("a= "+Arrays.toString(a));
        System.out.println("b= "+Arrays.toString(b));
    }

}
