package kpliakhanau.lesson4;

import java.util.Scanner;

public class taskC2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите день и месяц");
        System.out.println( Number (sc.nextInt(),sc.nextInt()));
    }

    private static Integer Number(int day,int month) {
        int num=0;
        for (int i=1; i<=month ; i++){
            switch (i){
                case 1:
                    num=day;
                    break;
                case 2:
                    num+=31;
                    break;
                case 3:
                    num+=28;
                    break;
                case 4:
                    num+=31;
                    break;
                case 5:
                    num+=30;
                    break;
                case 6:
                    num+=31;
                    break;
                case 7:
                    num+=30;
                    break;
                case 8:
                    num+=31;
                    break;
                case 9:
                    num+=31;
                    break;
                case 10:
                    num+=30;
                    break;
                case 11:
                    num+=31;
                    break;
                case 12:
                    num+=30;
                    break;
            }
        }
        return num;
    }
}
