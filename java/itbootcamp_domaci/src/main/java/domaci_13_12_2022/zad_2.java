package domaci_13_12_2022;

import java.util.Scanner;

public class zad_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mesec, godina;
        String broj_kartice, ime_prezime;

        mesec = 10; godina = 20;
        broj_kartice = "1234 1234 1234 1234";
        ime_prezime = "David Daki";

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*   Credit Card                              *\n" +
                "*     ****                                   *\n" +
                "*     ****                                   *\n" +
                "*       " + broj_kartice + "                  *\n" +
                "*                 valid > " + mesec + "/" + godina + "              *\n" +
                "*                                            *\n" +
                "*      " + ime_prezime + "                    *\n");

        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
        }






    }
}
