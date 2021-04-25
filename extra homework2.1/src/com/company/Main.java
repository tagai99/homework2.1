package com.company;
import java.util.Random;
public class Main {



    public static String generateRandomAge(int age, int temp) {
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
    public static void  main (String[] args) {
        Random it = new Random();
        int a = it.nextInt();
        int b = it.nextInt();
        int c = it.nextInt();

        String res1 = generateRandomAge(a, -18);
        String res2 = generateRandomAge(b, 27);
        String res3 = generateRandomAge(c, 10);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}