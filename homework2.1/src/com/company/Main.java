package com.company;
public class Main {



    public static String goWalk(int age, int temp) {
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return "Можно идти гулять!";
        } else if ((age < 20) && (temp > 0 && temp < 28)) {
            return "Можно идти гулять!";
        } else if ((age > 45) && (temp > -10 && temp < 25)) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома!!!";
        }
    }
    public static void main(String[] args) {
        String res1 = goWalk(44, -18);
        String res2 = goWalk(21, 27);
        String res3 = goWalk(20, 10);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }








}