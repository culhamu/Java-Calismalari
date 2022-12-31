package Calisma04;

import java.util.Scanner;

public class Ders04 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayı giriniz");

        double dbl1=scan.nextDouble();

        System.out.println("Lütfen ondalıklı bir sayı giriniz");

        double dbl2=scan.nextDouble();

        int ort=(int) (dbl1+dbl2)/2;
        System.out.println(ort);

    }
}
