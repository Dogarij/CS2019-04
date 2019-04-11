package kpliakhanau.lesson4;

import java.util.Scanner;

public class taskC1 {
    public static void main(String[] args) {
        System.out.println("Какую зарплату вы хотите?");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        double nul = 0;
        if (money < 300 || money > 3000) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int month = 0; month <= 14; month++) {
                if (month == 0 || month == 13 || month == 14)
                    System.out.println(nul);
                else if (month != 6 && month != 7 && month != 8) {
                    System.out.println(money + money /2);
                    if (money+money/2 == 666) break;
                } else {
                    switch (month) {
                        case 6:
                            System.out.println(money + " - Июнь");
                            break;
                        case 7:
                            System.out.println(money + " - Июль");
                            break;
                        case 8:
                            System.out.println(money + " - Август");
                            break;
                        }
                    if (money == 666) break;
                    }
              }
        }
    }
}

