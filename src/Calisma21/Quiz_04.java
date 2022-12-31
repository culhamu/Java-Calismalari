package Calisma21;

import java.util.Scanner;

public class Quiz_04 {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
         yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
            olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen cinsiyetinizi giriniz:"+" E:Erkek / K:Kadın");
        char cnsyt=scan.next().charAt(0);
        System.out.print("Lütfen yasinizi giriniz: ");
        int yas=scan.nextInt();

        if (cnsyt=='K'){
            if (yas<=18){
                System.out.println("gecersiz giris");
            } else if (yas<60) {
                System.out.println((60-yas)+" yıl daha calısmalısınız");

            }else System.out.println("Emekli olabilirsiniz");

        } else if (cnsyt=='E') {
            if (yas<=18){
                System.out.println("gecersiz giris");
            }else if (yas<65) {
                System.out.println((65 - yas) + " yıl daha calısmalısınız");
            }else System.out.println("Emekli olabilirsiniz");
        }else System.out.println("Geçersiz giris");
    }
}
