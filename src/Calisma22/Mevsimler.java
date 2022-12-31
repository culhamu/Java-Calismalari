package Calisma22;

import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {
        /*
        Kullanicidan ay numarasini alip mevsimi yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ay numarasını giriniz");
        int AyNo=scan.nextInt();

        switch (AyNo){
            case 1:
            case 2:
                System.out.println("Kiş");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlk Bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            case 12:
                System.out.println("Kış");
                break;
            default:
                System.out.println("Geçersiz giriş");

        }

    }
}
