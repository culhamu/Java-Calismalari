package Calisma06;

import java.util.Locale;
import java.util.Scanner;

public class Ders01 {
    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilenGun=scan.next();
        String KullanilanGun=girilenGun.toLowerCase();

        switch (KullanilanGun){
        case "pazartesi":
            System.out.println("Calisma zamani, Tatile 5 gun var");
            break;
            case "sali":
                System.out.println("Calisma zamani, Tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println("Calisma zamani, Tatile 3 gun var");
                break;
            case "persembe":
                System.out.println("Calisma zamani, Tatile 2 gun var");
                break;
            case "cuma":
                System.out.println("Calisma zamani, Tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Hatali Gun girisi");


        }

    }
}
