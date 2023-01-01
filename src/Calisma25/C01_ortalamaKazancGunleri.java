package Calisma25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_ortalamaKazancGunleri {
    public static void main(String[] args) {
        /*
        Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.
         */
        Scanner scan=new Scanner(System.in);

        List<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
        List<Double> kazancList=new ArrayList<>();


        int sayac=0;

        while (sayac<=gunler.size()){

            for (int i = 0; i < gunler.size(); i++) {
                System.out.println("Lütfen "+gunler.get(i)+" günü kazancını giriniz");
               double kazanc=scan.nextDouble();
               kazancList.add(kazanc);
               sayac++;

            }break;

        }
        System.out.println(getOrtalamaKazanc(kazancList));
        System.out.println(getOrtalamaninUstundeKazancGunleri(kazancList));
        System.out.println(getOrtalamaninAltindaKazancGunleri(kazancList));

    }public static Double getOrtalamaKazanc(List<Double> kazancList){
        double ortKazanc=0;
        int toplam=0;

        for (int i = 0; i < kazancList.size(); i++) {
            toplam+=kazancList.get(i);

        }ortKazanc=toplam/7;
        return ortKazanc;
    }public static List<String> getOrtalamaninUstundeKazancGunleri(List<Double> kazancList){

        List<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
        List<String> ortUstunGunler=new ArrayList<>();
        for (int i = 0; i < kazancList.size(); i++) {

            if (kazancList.get(i)>=getOrtalamaKazanc(kazancList)){

                ortUstunGunler.add(gunler.get(i));
            }

        }

        return ortUstunGunler ;
    }public static List<String> getOrtalamaninAltindaKazancGunleri(List<Double> kazancList){
        List<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
        List<String> ortAltGunler=new ArrayList<>();
        for (int i = 0; i < kazancList.size(); i++) {
            if (kazancList.get(i)<=getOrtalamaKazanc(kazancList)){

                ortAltGunler.add(gunler.get(i));
            }

        }return ortAltGunler;




    }
}
