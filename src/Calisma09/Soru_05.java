package Calisma09;

import java.util.Scanner;

public class Soru_05 {
    public static void main(String[] args) {
        /*
        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen)
         ve LCM'yi bulun (En Küçük Ortak Kat)
       Giriş :30 ve 40
        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz.
        İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet pozitif sayı giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        int ebob=0;
        int ekok=0;

        int buyukSayi=0;
        if (sayi1>sayi2){
            buyukSayi=sayi1;
        }else buyukSayi=sayi2;
        for (int i = 2; i < buyukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }

        }ekok=(sayi1*sayi2)/ebob;


        System.out.println("Sayıların ebeobu: "+ebob+ "\n Sayıların ekoku: "+ ekok);
        }
    }

