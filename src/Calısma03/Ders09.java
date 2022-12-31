package Calısma03;

import java.util.Scanner;

public class Ders09 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        double sayi2=scan.nextDouble();

        sayi1=(int) sayi2;
        sayi2=(int) sayi1;
        System.out.println(sayi1+"\n"+sayi2);


    }
}
