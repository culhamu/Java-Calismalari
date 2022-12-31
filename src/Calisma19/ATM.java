package Calisma19;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        String İşlemler=
                "1. İşlem : Bakiye Öğrenme\n"+
                "2. İşlem : Para Çekme\n "+
                "3. İşlem : Para Yatırma\n"+
                "Çıkış : q";
        System.out.println("*****************************************\t\t");
        System.out.println(İşlemler);
        System.out.println("*****************************************\t\t");
       while (true){
           System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
           String islem= scan.nextLine();

           if (islem.equals("q")) {
               System.out.println("Sistemden çıkılıyor...");
               break;
           } else if (islem.equals("1")) {
               System.out.println("Bakiyeniz:"+bakiye);

           } else if (islem.equals("2")) {
               System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
               int tutar= scan.nextInt();
               scan.nextLine();
               if (bakiye-tutar<0){
                   System.out.println("Bakiyeniz yetersiz.Bakiyeniz:"+bakiye);
               }else bakiye-=tutar;
               System.out.println("Yeni bakiyeniz:"+bakiye);

           } else if (islem.equals("3")) {
               System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
               int tutar= scan.nextInt();
               scan.nextLine();
               bakiye+=tutar;
               System.out.println("Yeni bakiyeniz:"+bakiye);

           }else System.out.println("Geçersiz işlem");
       }

    }
}
