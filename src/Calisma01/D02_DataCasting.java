package Calisma01;

import java.util.Scanner;

public class D02_DataCasting {
    public static void main(String[] args) {
        System.out.println(5 / 6);
        System.out.println(29 / 4);
        double dbl=9;
        int sayi=5;
        System.out.println(dbl/sayi);
          double dbl2=15;
          int sayi2=6;
        System.out.println(dbl2/sayi2);
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı giriniz");
        int ilksayi= scan.nextInt();
        int  ikincisayi= scan.nextInt();
        System.out.println("iki sayının bölümü:"+(double)(ilksayi/ikincisayi));

    }
}
