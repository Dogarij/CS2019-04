package kpliakhanau.lesson4;

import java.util.Scanner;

public class taskA2 {
    public static void main(String[] args) {
        System.out.println("Введтте номер дня недели");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num <1 || num >7){
            System.out.println("Такого дня недели не существует");
        }else{
            switch (num) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }
        }

    }
}
