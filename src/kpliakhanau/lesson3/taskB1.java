package kpliakhanau.lesson3;

import java.util.Scanner;

public class taskB1 {
    public taskB1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Double d = (double)b * (double)b - (double)(4 * a * c);
        if (d > 0.0D) {
            jopa(d, a, b);
        } else if (d == 0.0D) {
            Double x1 = (double)(-b) / (double)(2 * a);
            System.out.println(x1);
        } else {
            System.out.printf("Корней нет");
        }

    }

    private static void jopa(Double d, int a, int b) {
        Double x1 = ((double)(-b) + Math.sqrt(d)) / (double)(2 * a);
        Double x2 = ((double)(-b) - Math.sqrt(d)) / (double)(2 * a);
        System.out.println(x1 + " " + x2);
    }
}
