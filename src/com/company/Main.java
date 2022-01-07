package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("nhập a,b,c:");
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation qe01=new QuadraticEquation(a,b,c);
        double delta=qe01.getDiscriminant();
        if (delta>0){
            System.out.println("x1="+qe01.getRoot1());
            System.out.println("x2="+qe01.getRoot2());
        } else if (delta == 0) {
            System.out.println("x1=x2"+qe01.getRoot1());
        }else {
            System.out.println("Phuong trinh vo nghiem");

        }

    }

}

