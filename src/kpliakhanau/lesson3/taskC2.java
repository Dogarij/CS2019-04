package kpliakhanau.lesson3;

import java.util.Scanner;

public class taskC2 {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        Scanner sc=new Scanner(System.in);
        System.out.println(Sum(sc.nextInt()));
    }
    private static Integer Sum(int number) {
        int sum=0;
        if (number >9999 | number < 1000){
            System.out.println("Введенное число не четырехзначное");
        }
        else {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
        }
        return sum;
    }
}
