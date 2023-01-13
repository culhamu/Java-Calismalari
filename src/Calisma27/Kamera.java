package Calisma27;

import java.util.Scanner;

public class Kamera {
    public static void main(String[] args) {

        plakaNumarasiOkuma();
    }

    public static String plakaNumarasiOkuma() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen plaka numarasını giriniz ");
        String plaka=scan.nextLine();

        return plaka;
    }
}
