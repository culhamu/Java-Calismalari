package Calisma29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {
    static Scanner scan=new Scanner(System.in);
    static Map<String,String> ogrenciMap=new HashMap<>();

    public static void ogrenciEkle() {
      ogrenciMap .put("12345678912","Ali,Can,15,1070,10");
      ogrenciMap .put("12345678913","Veli,Cem,15,1071,10");
      ogrenciMap .put("12345678914","Ayse,Can,16,1072,11");
      ogrenciMap .put("12345678915","Ahmet,San,16,1073,11");
      ogrenciMap .put("12345678916","Alphan,Cem,17,1074,12");
    }

    public static void ogrenciMenu() throws InterruptedException {
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
                    ogrenciekleme();
                    break;
                case "2":
                    arama();
                    break;
                case "3":
                    ogrenciListesiYazdir();
                    break;
                case "4":
                    ogrenciSilme();
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

    private static void ogrenciSilme() throws InterruptedException {
        System.out.println("Silmek istediğiniz ogrenci'nin TcNo :");
        String tcNo=scan.nextLine();
        String silinecekValue=ogrenciMap.get(tcNo);
        String sonucValue= ogrenciMap.remove(tcNo);
        try {
            sonucValue.equals(silinecekValue);
            System.out.println(tcNo+"'lu ogrenci listeden silindi");
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Silmek istediğiniz ogrenci bulunamadı");
            Thread.sleep(3000);
        }
    }

    public static void ogrenciekleme() {
        System.out.println("TcNo : ");
        String tcNo=scan.nextLine();
        System.out.println("İsim : ");
        String isim=scan.nextLine();
        System.out.println("Soyisim : ");
        String soyisim=scan.nextLine();
        System.out.println("Yas : ");
        String yas=scan.nextLine();
        System.out.println("Numara : ");
        String numara=scan.nextLine();
        System.out.println("Sınıf: ");
        String sinif=scan.nextLine();
        String eklenecekValue=isim+","+soyisim+","+yas+","+numara+","+sinif;
        ogrenciMap.put(tcNo,eklenecekValue);

    }

    private static void arama() throws InterruptedException {
        System.out.println("Aradığınız ogrenci tcNo'sunu giriniz");
        String istenenTcNo=scan.nextLine();
        Set<Map.Entry<String,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("***********TcNo ile Öğrenci arama*************\n"+
                "TCNo        İsim   Soyisim  Yaş Numara Sınıf");
        for (Map.Entry<String,String> each:ogrenciEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String[] eachValueArr=eachValue.split(",");
            if (istenenTcNo.equals(eachKey)){
                System.out.printf("%11s %-6S %-8s %-2s %-9s %-6s \n",eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3],eachValueArr[4]);
            }
        }
        Thread.sleep(2000);


    }

    public static void ogrenciListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("***************Öğrenci Listesi******************\n"+
                "TCNo        İsim   Soyisim  Yaş Numara Sınıf");
        for (Map.Entry<String,String> each:ogrenciEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String[] eachValueArr=eachValue.split(",");
            System.out.printf("%11s %-6S %-8s %-2s %-9s %-6s \n",eachKey,eachValueArr[0],eachValueArr[1],
                    eachValueArr[2],eachValueArr[3],eachValueArr[4]);
        }
        Thread.sleep(2000);
    }
}
