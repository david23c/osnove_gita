package p14_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();


        if ( (a>b && a<c) || (a<b && a>c) ) {
            System.out.println("a je izmedju b i c.");
        }
        else {
            System.out.println("a nije izmedju b i c.");
        }



    }
}
