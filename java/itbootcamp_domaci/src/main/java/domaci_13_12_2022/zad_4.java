package domaci_13_12_2022;

import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite
        proizvoljnu vrednost.
        Primer izvrsenja programa:
        a: 10
        Povrsina je 43.25
        Obim je 30
         */

        int a, b, c, obim;
        double povrsina, koren_iz_tri;
        koren_iz_tri = 1.73;
        a = 10;
        obim = 3*a;
        povrsina = (a*a * koren_iz_tri) / 4;

        System.out.println(povrsina);



    }
}
