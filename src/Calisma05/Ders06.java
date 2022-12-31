package Calisma05;

import java.util.Scanner;

public class Ders06 {
    public static void main(String[] args) {

        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir saı giriniz");
        int sayi= scan.nextInt();

        switch (sayi){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("geçersiz gün girişi");

        }
    }
}
