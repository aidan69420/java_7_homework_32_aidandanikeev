package com.company;

import java.util.Scanner;

public class Automat {

    public static void print(){
        Automat a = new Automat();
        Food[] foods = new Food[4];
        foods[0] = new Food("Кетчунез", 90);
        foods[1] = new Food("Жаренные гвозди", 30);
        foods[2] = new Food("Газировка", 40);
        foods[3] = new Food("Батончик", 50);
        for (int i = 0; i<3; i++){
            System.out.println(foods[i]);
        }
    }
    public void addMoney(Wallet w){
        Scanner sc = new Scanner(System.in);
        w.addBalance(sc.nextInt());
    }
}
