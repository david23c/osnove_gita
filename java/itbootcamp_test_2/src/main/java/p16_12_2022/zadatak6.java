package p16_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       String ime, prezime;
       int jmbg, broj_primeraka;

        System.out.println("Unesite ime: ");
        ime = s.next();
        System.out.println("Unesite prezime: ");
        prezime = s.next();
        System.out.println("Unesite jmbg: ");
        jmbg = s.nextInt();
        System.out.println("Unesite zeljeni broj primeraka: ");
        broj_primeraka = s.nextInt();

        for (int i = 1; i <= broj_primeraka; i++) {
            System.out.println("Primerak " + i + ":");
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG " + jmbg);
            System.out.println("**********************************");
            System.out.println();

        }




    }
}
