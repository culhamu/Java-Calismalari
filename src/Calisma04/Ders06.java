package Calisma04;

import java.util.Scanner;

public class Ders06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir sayı giriniz");
        int girilenSayi= scan.nextInt();


        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;


        System.out.println("Girilen sayının rakamlar Toplamı:"+rakamlarToplami);




    }
}
