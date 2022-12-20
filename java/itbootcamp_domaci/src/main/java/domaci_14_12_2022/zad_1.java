package domaci_14_12_2022;

import java.util.Scanner;

public class zad_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);



        /* Napisati program koji ima informacije koje ucitava informacije sa tastature:
        Ime
                Prezime
        godinu rodjenja
        I stampa informaicije u formatu:
        [ime] [prezime] - [startost] god

        Primer izvrsenja:
        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
        Milan Jovanovic - 26 god */

        String ime, prezime;
        int godina_rodjenja, starost, trenutna_godina;

//        unos promenljivih...
        ime = s.next();
        prezime = s.next();
        godina_rodjenja = s.nextInt();

        starost = trenutna_godina - godina_rodjenja;

        System.out.println(ime+ " " + prezime + starost + " god");

    }
}
