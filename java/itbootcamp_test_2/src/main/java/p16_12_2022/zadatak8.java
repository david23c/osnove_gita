package p16_12_2022;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi A: ");
        int a = s.nextInt();
        System.out.println("Unesi B: ");
        int b = s.nextInt();

        for (int i = 0; i <= 10; i++) {
            if (i != a && i != b) {
                System.out.println(i);
            }
        }





    }
}
