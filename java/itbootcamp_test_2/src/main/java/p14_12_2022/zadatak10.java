package p14_12_2022;

import java.util.Scanner;

public class zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int broj = s.nextInt();

        if (broj % 2 == 0) {
            System.out.println("Broje je deljiv sa 2");
        } else if (broj % 3 == 0) {
            System.out.println("Broj je deljiv sa 3");
        }

    }
}
