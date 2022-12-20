package domaci_13_12_2022;

import java.util.Scanner;

public class zad_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*Napisati program koji stampa verziju softvera.
        Verzija softvera se sastoji od major, minor i
         patch brojeva. Koristan link za verzionisanje
         softvera. Odstampati na ekranu verziju softvera
          u formatu:
        [MAJOR].[MINOR].[PATCH]*/

        int major, minor;
        String patch;
        major = 5;
        minor = 6;
        patch = "1";

        System.out.println("Verzija softvera: ");
        System.out.println(major + "." + minor + "." + patch);





    }
}
