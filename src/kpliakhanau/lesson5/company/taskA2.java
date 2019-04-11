package kpliakhanau.lesson5.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class taskA2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> mylist= new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (;;){
            String s=reader.readLine();
            if (s.equals("End"))break;
            else {
                mylist.add(s);
            }
        }
        System.out.println(mylist);
    }
}
