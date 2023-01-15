package Calisma29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan=new Scanner(System.in);
   static Map<String,String> ogretmenMap=new HashMap<>();
   
    public static void ogretmenEkle() {
        ogretmenMap.put("12345678912","Ali,Can,30,Kimya,123456");
        ogretmenMap.put("12345678913","Veli,Cem,25,Fizik,123457");
        ogretmenMap.put("12345678914","Ayse,Can,23,Matematik,123458");
        ogretmenMap.put("12345678915","Ahmet,San,35,Biyoloji,123450");
        ogretmenMap.put("12345678916","Alphan,Cem,43,Edebiyat,123459");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("============= İŞLEMLER =============\n" +
                    "\t\t 1-EKLEME\t\t\t \n" +
                    "\t\t 2-ARAMA\n" +
                    "\t\t 3-LİSTELEME\n" +
                    "\t\t 4-SİLME\n" +
                    "\t\t Q-ÇIKIŞ\n" +
                    "\t\t\n" +
                    "\tSEÇİMİNİZ:");
            tercih=scan.nextLine();
            switch (tercih){
                case "1":
                    ogretmenekleme();
                    break;
                case "2":
                    arama();
                    break;
                case "3":
                    ogretmenListesiYazdir();
                    break;
                case "4":
                    ogretmenSilme();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem seçiniz");
            }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    private static void ogretmenSilme() throws InterruptedException {
        System.out.println("Silmek istediğiniz öğretmenin TcNo :");
        String tcNo=scan.nextLine();
        String silinecekValue=ogretmenMap.get(tcNo);
       String sonucValue= ogretmenMap.remove(tcNo);
        try {
            sonucValue.equals(silinecekValue);
            System.out.println(tcNo+"'lu öğretmen listeden silindi");
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Silmek istediğiniz öğretmen bulunamadı");
            Thread.sleep(3000);
        }
    }

    public static void ogretmenekleme() {
        System.out.println("TcNo : ");
        String tcNo=scan.nextLine();
        System.out.println("İsim : ");
        String isim=scan.nextLine();
        System.out.println("Soyisim : ");
        String soyisim=scan.nextLine();
        System.out.println("Yas : ");
        String yas=scan.nextLine();
        System.out.println("Bölüm : ");
        String bolum=scan.nextLine();
        System.out.println("SicilNo : ");
        String sicilNo=scan.nextLine();
        String eklenecekValue=isim+","+soyisim+","+yas+","+bolum+","+sicilNo;
        ogretmenMap.put(tcNo,eklenecekValue);

    }

    private static void arama() throws InterruptedException {
        System.out.println("Aradığınız Öğretmenin tcNo'sunu giriniz");
        String istenenTcNo=scan.nextLine();
        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenMap.entrySet();
        System.out.println("***********TcNo ile Öğretmen arama*************\n"+
                "TCNo        İsim   Soyisim  Yaş Bölüm    SicilNo");
        for (Map.Entry<String,String> each:ogretmenEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if (istenenTcNo.equals(eachKey)){
                System.out.printf("%11s %-6S %-8s %-2s %-9s %-6s \n",eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3],eachValueArr[4]);
            }
        }
        Thread.sleep(3000);


    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenMap.entrySet();
        System.out.println("***************Öğretmen Listesi******************\n"+
                "TCNo        İsim   Soyisim  Yaş Bölüm    SicilNo");
        for (Map.Entry<String,String> each:ogretmenEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String[] eachValueArr=eachValue.split(",");
            System.out.printf("%11s %-6S %-8s %-2s %-9s %-6s \n",eachKey,eachValueArr[0],eachValueArr[1],
                    eachValueArr[2],eachValueArr[3],eachValueArr[4]);
        }
        Thread.sleep(3000);
    }
}
