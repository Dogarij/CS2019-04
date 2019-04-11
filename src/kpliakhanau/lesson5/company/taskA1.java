package kpliakhanau.lesson5.company;

import java.util.Scanner;

public class taskA1 {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите десять чисел");
        int [] Arr = new int [10];
        for (int i = 9; i >=0; i--) {
            Arr[i]=sc.nextInt();
        }
        for (int i : Arr) {
            System.out.println(i);
        }
    }
}
