package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Automat a = new Automat();
        Wallet w = new Wallet();
        getStart(w,a);
    }
    public static void getStart(Wallet w, Automat a){
        while (w.balance < 25){
            System.out.println("В автомате доступны: ");
            a.print();
            System.out.println("\n" + w.toString());
            System.out.println("\nЧто вы хотите сделать?: " + "\na - Закинуть еще монет" + "\nw - выйти");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("a")){
                System.out.println("Пополните баланс (введите число денег и они вам начислятся на баланс)");
                a.addMoney(w);
            }
            if (str.equals("w")){
                break;
            }
        }
        while (w.balance > 25){
            System.out.println("В автомате доступны: ");
            a.print();
            System.out.println("\n" + w.toString());
            System.out.println("\nЧто вы хотите сделать?: " + "\nq - Закинуть еще монет" + "\nw - выйти");
            addProducts(w);
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("a")){
                System.out.println("Пополните баланс (введите число денег и они вам начислятся на баланс)");
                a.addMoney(w);
                System.out.println("\n" + w.toString());
            }
            if (str.equals("w")){
                break;
            }
        }
    }
    public static void addProducts(Wallet w){
        if(w.balance > 90){
            System.out.println("e - Купить кетчунез(90) \nr - Купить жаренных гвоздей(30) \nt - Купить газировку (40) \ny - Купить батончик (50)");
            Scanner sc = new Scanner(System.in);
            buyProducts(w, sc.nextLine());
        }
        if(w.balance > 50){
            System.out.println("r - Купить жаренных гвоздей(30) \nt - Купить газировку (40) \ny - Купить батончик (50)");
            Scanner sc = new Scanner(System.in);
            buyProducts(w, sc.nextLine());
        }
        if(w.balance > 40){
            System.out.println("r - Купить жаренных гвоздей(30) \nt - Купить газировку (40)");
            Scanner sc = new Scanner(System.in);
            buyProducts(w, sc.nextLine());
        }
        if(w.balance > 30){
            System.out.println("nr - Купить жаренных гвоздей(30)");
            Scanner sc = new Scanner(System.in);
            buyProducts(w, sc.nextLine());
        }
    }
    public static void buyProducts(Wallet w, String str){
        if (str.equals("e")){
            System.out.println("Поздравляем, вы купили кетчунез");
            w.balance = w.balance - 90;
            System.out.println(w.toString());

        }
        if (str.equals("r")){
            System.out.println("Поздравляем, вы купили жаренных гвоздей");
            w.balance = w.balance-30;
            System.out.println(w.toString());
        }
        if (str.equals("t")){
            System.out.println("Поздравляем, вы купили газировку");
            w.balance = w.balance - 40;
            System.out.println(w.toString());
        }
        if (str.equals("y")){
            System.out.println("Поздравляем, вы купили батончик");
            w.balance = w.balance - 50;
            System.out.println(w.toString());
        }
    }
}