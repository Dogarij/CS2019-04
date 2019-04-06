package kpliakhanau.lesson4;

import java.util.Scanner;

public class taskB1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер таблицы");
        int i = sc.nextInt();
        int j=1;
        while (j<=i){
            int f=1;
            while (f<=i){
                System.out.printf("%4d",j*f);
                f++;
            }
            j++;
            System.out.print("\n");
        }
    }
}
