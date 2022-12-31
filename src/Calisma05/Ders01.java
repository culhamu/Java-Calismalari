package Calisma05;

import java.util.Scanner;

public class Ders01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilensayi=scan.nextInt();
        System.out.println("Girilen sayi 5 in katı:" + (girilensayi/5==0));
    }
}
