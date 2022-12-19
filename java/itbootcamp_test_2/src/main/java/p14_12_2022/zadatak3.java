package p14_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a, b, c;
        System.out.println("Unesite 1. broj: ");
        a = s.nextInt();
        System.out.println("Unesite 2. broj: ");
        b = s.nextInt();
        System.out.println("Unesite 3. broj: ");
        c = s.nextInt();

        double srednja_vrednost;
        srednja_vrednost = (a + b + c) / 3;

        System.out.println("Srednja vrednost: " + srednja_vrednost);



    }
}
