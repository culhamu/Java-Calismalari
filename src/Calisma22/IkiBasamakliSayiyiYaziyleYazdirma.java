package Calisma22;

import java.util.Scanner;

public class IkiBasamakliSayiyiYaziyleYazdirma {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int onlar=sayi/10;
        int birler=sayi%10;

        switch (onlar){
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmis");
                break;
            case 7:
                System.out.println("yetmis");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
            default:
                System.out.println("Gecersiz sayi");
        }

        switch (birler){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Gecersiz sayi");

        }
    }
}
