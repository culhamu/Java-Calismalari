package Calisma25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_ManavList {
    static List<String> urunList=new ArrayList<>(Arrays.asList("portakal","mandalina","kivi","muz","elma"));
    static List<Integer>  fiyatList=new ArrayList<>(Arrays.asList(10,12,18,10,15));
    static double toplam=0;
    public static void main(String[] args) {
        /*
         Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
             bitirmek isteyene kadar tekrarla.
   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
         */
        List<String> urunList=new ArrayList<>(Arrays.asList("portakal","mandalina","kivi","muz","elma"));
        List<Integer>  fiyatList=new ArrayList<>(Arrays.asList(18,10,25,35,15));

        menu();
    }public static void menu(){
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+".ürün "+urunList.get(i)+" fiyatı "+fiyatList.get(i)+" tl");

        }
        System.out.println("seçmek istediğiniz ürünün kodunu giriniz");
        int urun= scan.nextInt();
        System.out.println("Miktar giriniz");
        double miktar= scan.nextDouble();
        toplam=miktar*fiyatList.get(urun-1);

        System.out.println("Alışverişe devam etmek istiyor musunuz:E/H");
        char secim=scan.next().charAt(0);

        if (secim=='e'||secim=='E'){
            menu();
        }else System.out.println("ödenecek tutar"+toplam);

    }

}
