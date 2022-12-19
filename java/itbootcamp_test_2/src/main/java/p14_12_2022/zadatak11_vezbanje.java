package p14_12_2022;

import java.util.Scanner;

public class zadatak11_vezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int zvuk = 75;
        String akcija;

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute: ");
        akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        if (zvuk > 100) {
            zvuk = 100;
        } else if (zvuk < 0) {
            zvuk = 0;
        }

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute: ");
        akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        if (zvuk > 100) {
            zvuk = 100;
        } else if (zvuk < 0) {
            zvuk = 0;
        }

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute: ");
        akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        if (zvuk > 100) {
            zvuk = 100;
        } else if (zvuk < 0) {
            zvuk = 0;
        }

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute: ");
        akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        if (zvuk > 100) {
            zvuk = 100;
        } else if (zvuk < 0) {
            zvuk = 0;
        }

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute: ");
        akcija = s.next();
        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        if (zvuk > 100) {
            zvuk = 100;
        } else if (zvuk < 0) {
            zvuk = 0;
        }


        System.out.println("Jacina zvuka je: " + zvuk);


    }
}
