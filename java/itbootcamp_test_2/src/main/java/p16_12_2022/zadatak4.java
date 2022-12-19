package p16_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi m: ");
        int m = s.nextInt();
        System.out.println("Unesi n: ");
        int n = s.nextInt();
        int i;
        for (i=m; i < n; i++) {
            System.out.print(i + ", ");
        }

    }
}
