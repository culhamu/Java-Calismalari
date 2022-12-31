package Calısma03;

import java.util.Scanner;

public class Ders06 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi Yazınız");
        String isim=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas=scan.nextInt();
        System.out.println(isim+" "+soyisim+","+yas);
    }
}
