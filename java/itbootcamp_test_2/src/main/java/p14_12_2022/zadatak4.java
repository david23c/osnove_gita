package p14_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a  = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();

        if (a > b) {
            System.out.println("Vece je a");
        } else if (b > a) {
            System.out.println("Vece je b");
        }else {
            System.out.println("Jednaki su");
        }


    }
}
