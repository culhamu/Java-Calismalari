package Calisma03;

import java.util.Scanner;

public class Ders08 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int sayi2=scan.nextInt();

        int temp;
        temp=sayi1;

        sayi1=sayi2;

        sayi2=temp;

        System.out.println("Sayıların yerini değiştirdim"+"\n sayı1 in değeri :"+sayi1+"\n sayı2 nin değeri:"+sayi2);

    }
}
