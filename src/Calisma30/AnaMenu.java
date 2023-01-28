package Calisma30;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
    Scanner scan=new Scanner(System.in);
void anaMenu() throws InterruptedException {
    System.out.println("====================================\n" +
            "\t YILDIZ HASTAHANESİ YÖNETİM PANELİ\n" +
            "\t====================================\n" +
            "\t 1- DOKTOR İŞLEMLERİ\n" +
            "\t 2- HEMŞİRE İŞLEMLERİ\n" +
            "\t 3- HASTA İŞLEMLERİ\n" +
            "\t Q- ÇIKIŞ\n"+
            "\t SEÇİMİNİZ : ");
    try {
        int tercih=scan.nextInt();
        switch (tercih){
            case 1:{
                Doktor doktor=new Doktor();

            }
            case 2:{
                Hemsire hemsire=new Hemsire();
            }
            case 3:{
                Hasta hasta =new Hasta();
            }
        }

    }catch (InputMismatchException e){
        String tercih=scan.next();
        if (tercih.equalsIgnoreCase("q")){
            Depo depo=new Depo();
            depo.projeyiDurdur();

        }else {
            System.out.println("HATALI GİRİŞ YAPTINIZ");
            Thread.sleep(2000);
            anaMenu();
            Collection
        }
    }
}
}
