package kpliakhanau.lesson5.company;

import java.util.ArrayList;
import java.util.Collections;

public class taskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"ONE","TWO","TREE","FOUR","FIVE");
        System.out.println("Размер списка "+list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
