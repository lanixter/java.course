package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int result = number % 4;
        System.out.println("result= " + result);

        if (result == 0 && number >= 10){
            System.out.println("число делится на 4, и оно не меньше 10.");

        } else if (result == 0 && 10 > number) {
            System.out.println("Введеное число меньше 10, но делится на  4 без остатка");

        } else if (result != 0 && 10 > number) {
            System.out.println("Введеное число меньше 10 и не делится на  4 без остатка");


        }else if (result != 0 && number >= 10) {
        System.out.println("Введеное число больше 10, но не делится на  4 без остатка");}

    }
}
