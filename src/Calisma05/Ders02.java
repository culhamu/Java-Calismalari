package Calisma05;

import java.util.Scanner;

public class Ders02 {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km türünden giriniz");
        double dbl= scan.nextDouble();

        System.out.println("Lütfen çevirmek istediğiniz metre türünü giriniz");
        double cvrDbl= scan.nextDouble();

        if (dbl%1000==0){
            System.out.println("mesafe m değeri:" + dbl/1000  );

        } else if (dbl%100000==0) {
            System.out.println("mesafe cm değeri: " +dbl/100000);

        }else System.out.println("istediginiz birim sisteme kayitli degil");


    }
}
