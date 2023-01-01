package Calisma01;

import java.util.Scanner;

public class D07_modolus {
    public static void main(String[] args) {
        System.out.println(45%8);
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir sayı giriniz");
        int girilenSayi=scan.nextInt();
        int birlerBasamagı=(0);
        int rakamlarToplamı=(0);
        birlerBasamagı=girilenSayi%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı;
        girilenSayi=girilenSayi/10;
        birlerBasamagı=girilenSayi%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı;
        girilenSayi=girilenSayi/10;
        birlerBasamagı=girilenSayi%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı;
        girilenSayi=girilenSayi/10;
        birlerBasamagı=girilenSayi%10;
        rakamlarToplamı=rakamlarToplamı+birlerBasamagı;
        girilenSayi=girilenSayi/10;
        System.out.println("girilen sayının rakamları toplamı:"+rakamlarToplamı);
    }
}
