package Calısma01;

import java.util.Scanner;

public class D01_dataCasting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        System.out.println("Lütfen bir double sayı giriniz");
        double scandbl= scan.nextDouble();
        System.out.println("lütfen bir tamsayı giriniz");
        int scanint= scan.nextInt();
        System.out.println(scandbl/scanint);



    }
}
