package Calisma04;

import java.util.Scanner;

public class Ders03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scan.nextInt();

        byte sayi2=(byte) sayi;
        System.out.println(sayi2);
    }
}
