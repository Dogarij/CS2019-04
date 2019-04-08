package com.company;


import java.util.Scanner;

public class taskB3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Введите число");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;;i++){
            sum+=i;
            if (sum>num) break;
            System.out.print(sum+" ");
        }
      }
	}

