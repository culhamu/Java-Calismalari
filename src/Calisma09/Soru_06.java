package Calisma09;

import java.util.Scanner;

public class Soru_06 {
    public static void main(String[] args) {
        /*
        Soru 23-)
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
         Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        System.out.println(faktoriyelOlustur(5));
    }

    public static int faktoriyelOlustur(int sayi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayı giriniz");
        sayi=scan.nextInt();
        int carpim=1;

        for (int i = sayi; i >0 ; i--) {
            carpim*=i;

        }
return carpim;
    }
}
