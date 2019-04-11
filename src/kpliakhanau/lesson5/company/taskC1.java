package kpliakhanau.lesson5.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taskC1 {
    public static void main(String[] args) {
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> other= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 20 чисел ");
        for (int i = 0; i < 20; i++) {
            listx.add(sc.nextInt());
        }
        for (Integer i : listx) {
            if (i%3==0){
                list3.add(i);
                if(i%2==0){
                    list2.add(i);
                }
            }else if (i%2==0){
                list2.add(i);
            }else other.add(i);
        }
        printList(list3);
        printList(list2);
        printList(other);
    }

     private static void printList (List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
