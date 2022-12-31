package Calisma19;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println("Lütfen basamak sayısını giriniz");
        int basamak_sayisi=scan.nextInt();

        int gecici_sayi=sayi;
        int toplam=0;

        do {
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi/=10;
            toplam+=Math.pow(basamak_degeri,basamak_sayisi);


        }while (gecici_sayi>0);
        if (sayi==toplam){
            System.out.println("Bu bir amstrong sayıdır");
        }else System.out.println("Bu bir amstrons sayı değildir");


    }
}
