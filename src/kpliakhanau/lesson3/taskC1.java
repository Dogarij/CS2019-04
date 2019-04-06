package kpliakhanau.lesson3;

import java.util.Scanner;

public class taskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Convert(sc.nextInt()));

    }
    private static Double Convert(Integer TC) {
        double TF= (TC *9/5)+32;
        return TF;
    }
}
