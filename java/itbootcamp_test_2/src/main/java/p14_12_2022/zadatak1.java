package p14_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite broj telefona: ");
        String broj_telefona = s.next();
        System.out.println("Unesite mejl: ");
        String mejl = s.next();
        System.out.println("Unesite JMBG: ");
        int jmbg = s.nextInt();

        System.out.println(ime + prezime + " - " + jmbg + "\n" +
                "Broj tel: " + broj_telefona + "\n" +
                "Imejl: " + mejl);
    }
}
