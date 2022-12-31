package Calisma04;

import java.util.Scanner;

public class Ders05 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz ");
        double dbl= scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz ");
        int sayi= scan.nextInt();

        int ort=(int) (dbl+sayi)/2;
        System.out.println(ort);
    }
}
