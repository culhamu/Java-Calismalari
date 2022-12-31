package Calisma21;

import java.util.Scanner;

public class Quiz_02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
       String input=scan.next();


        if (input.equalsIgnoreCase("a")){
            System.out.println("Aralik"+"Ağustos");
        } else if (input.equalsIgnoreCase("o")) {
            System.out.println("Ocak");
        }else if (input.equalsIgnoreCase("s")) {
            System.out.println("Subat");
        }else if (input.equalsIgnoreCase("m")) {
            System.out.println("Mart"+"Mayıs");
        }else if (input.equalsIgnoreCase("n")) {
            System.out.println("Nisan");
        }else if (input.equalsIgnoreCase("h")) {
            System.out.println("Haziran");
        }else if (input.equalsIgnoreCase("t")) {
            System.out.println("Temmuz");
        }else if (input.equalsIgnoreCase("e")) {
            System.out.println("Eylül"+"Ekim");
        }else  {
            System.out.println("Kasım");

        }
    }
}
