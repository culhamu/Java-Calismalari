package Calisma22;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayi giriniz");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {
            faktoriyel*=i;


            }
        System.out.print(faktoriyel);


        }


    }

