package Calisma29;

import java.util.Scanner;

public class Depo {

    static Scanner scan=new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {

        String tercih;
        do {
        System.out.println("    ====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n");
        System.out.println("Lütfen Menü'den tercihinizi yapınız");
        tercih=scan.nextLine();
        switch (tercih){
            case "1"://Öğrenci işlemleri
                Ogrenci.ogrenciMenu();
                break;
            case "2"://Öğretmen işlemleri
                Ogretmen.ogretmenMenu();
                break;
            case "q":
            case "Q":
                Depo.projeDurdur();
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz");

        }

        }while (!tercih.equalsIgnoreCase("Q"));
        Depo.projeDurdur();
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden çıkılıyor");
        System.exit(0);
    }
}
