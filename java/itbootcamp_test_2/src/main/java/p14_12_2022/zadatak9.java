package p14_12_2022;

import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//       int default = 75;
       int zvuk = 75;

        System.out.println("Unesi akciju za zvuk: pojacaj, smanji, mute ");
        String akcija = s.next();

        if (akcija.equals("pojacaj")) {
            zvuk = zvuk + 10;
        } else if (akcija.equals("smanji")) {
            zvuk = zvuk - 10;
        } else if (akcija.equals("mute") ) {
            zvuk = 0;
        }
        System.out.println("Akcija je: " + akcija);

        System.out.println("Jacina zvuka je: " + zvuk);

    }
}
