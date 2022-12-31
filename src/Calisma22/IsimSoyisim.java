package Calisma22;

import java.util.Scanner;

public class IsimSoyisim {
    public static void main(String[] args) {
        /*
       Kullanicidan isim ve soyismini ayri ayri alin.
        - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
        - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfrn isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String SoyIsim=scan.nextLine();


        if (isim.length()>=SoyIsim.length()){
            System.out.println((isim.toUpperCase().charAt(0)+isim.substring(1))+
                    (SoyIsim.toUpperCase().charAt(0)+SoyIsim.substring(1)));
        }if (SoyIsim.length()>=isim.length()){
            System.out.println((isim.toUpperCase().charAt(0)+isim.substring(1))+SoyIsim.toUpperCase());
        }
    }
}
