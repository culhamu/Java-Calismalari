package Calisma09;

import java.util.Scanner;

public class Soru_01 {
    public static void main(String[] args) {
        /*
        Soru 18-)
        Girilen araç hızı ve yol kilometresinden,
        gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim
        ve bize varış süremizi hesaplasın
        İpucu:yol=Hız*zaman
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaç km yol gittiğinizi giriniz");
        int yol=scan.nextInt();
        System.out.println("Lütfen kaç km hız ile gittiğinizi giriniz");
        int hiz=scan.nextInt();

        hizProblemi(yol,hiz);


    }public static void hizProblemi (double yol,int hiz){
        double zaman=0;
        zaman=yol/hiz;
        System.out.println(zaman+" saat de gittiniz");
    }
}
