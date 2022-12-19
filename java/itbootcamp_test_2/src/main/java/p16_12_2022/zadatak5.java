package p16_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi jacinu zvuka: ");
        int jacina = s.nextInt();
        System.out.print("<");
        if (jacina <= 10 && jacina > 0) {
            for (int i = 0; i <= jacina; i++) {
                System.out.print("| ");
            }
        } else if(jacina==0) {
            System.out.println("/");
        }





    }
}
