package p16_12_2022;

import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a od 1 do 20: ");
        int a = s.nextInt();
        System.out.println("Unesite broj b od 1 do 20: ");
        int b = s.nextInt();

        for (int i = 1; i <=20; i++) {
            if (i < a || i > b) {
                System.out.print("* ");
            } else if (i >= a && i <= b) {
                System.out.print("_ ");
            }
        }





    }
}
