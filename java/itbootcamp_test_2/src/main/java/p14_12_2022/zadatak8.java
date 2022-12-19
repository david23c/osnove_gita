package p14_12_2022;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi broj ");
        int broj = s.nextInt();

        if (broj < 10) {
            System.out.println("Jednocifren");
        } else if (broj > 10 && broj < 100) {
            System.out.println("Dvocifren");
        } else if (broj > 100 && broj < 1000) {
            System.out.println("Trocifren");
        }


    }
}
