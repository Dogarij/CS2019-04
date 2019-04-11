package kpliakhanau.lesson5.company;

import java.util.ArrayList;
import java.util.Scanner;

public class taskC2 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
        }
        int t;
        for (int a = 1; a < list.size() ; a++) {
            for (int b =list.size()-1 ; b >=a ; b--) {
                if (list.get(b-1)<list.get(b)){
                    t=list.get(b-1);
                    list.set(b-1,list.get(b));
                    list.set(b,t);
                }
            }
        }
        System.out.println(list);
    }
}
