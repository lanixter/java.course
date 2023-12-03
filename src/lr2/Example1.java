package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое чиисло");
        int value = in.nextInt();

        int result = value % 3;
        System.out.println("result= " + result);

        if (result == 0){
            System.out.println("Введеное чило делится на 3 без остатка");
        } else {
            System.out.println("Введеное число не делится на 3 без остатка");}
        }
    }

