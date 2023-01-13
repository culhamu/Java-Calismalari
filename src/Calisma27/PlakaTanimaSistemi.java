package Calisma27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlakaTanimaSistemi {
    /*
    Plaka Tanima Sistemi

1.	Karayollarinda bulunan mobesa kameralarinin mevcut araclarda ki plakalari okuyup
 bize arac hakkinda bilgi vermesini isteyen bir program tasarliyoruz.

2.	Kameradan okuma kismini kullanicidan plaka alarak simule – test edecegiz.

3.	Kullanici bir arac plakasi girdigi zaman veritabaninda olan ozellikleri bir class ta yaziniz.
(Plaka bilgisi, isim-soysisim, arac markasi, adres, arac durumu, vs gibi bilgiler)

4.	3. Maddede belirtilen ozelliklerde 10 tane nesne uretiniz ve bunlari bir dizi veya listede saklayiniz.

5.	Kullanicidan alacagimiz plakayi mevcut plakalarla kiyaslayiniz
zve supheli-calinti araclari ekranda yazdiriniz.

Bu odevin hedefleri
1.	Classlari kullanarak nesne uretmek,
2.	Getter ve setter yapilarini kullanabilmek,
3.	Dizi ve liste yapilarini kullanabilmek,
4.	for dongulerini kullanabilmek,
5.	if-else yapilarini kullanabilmek.
     */
    public static void main(String[] args) {
       Arac arac1=new Arac("01 aa 0001","Ali","Cem","Audi","Adana","ikinci el");
       Arac arac2=new Arac("02 bb 0002","Ahmet","Can","Mercedes","Adıyaman","ikinci el");
       Arac arac3=new Arac("03 cc 0003","Burak","Tan","volksWagen","Afyon","Birinci el");
       Arac arac4=new Arac("04 dd 0004","Mert","kale","Seat","Ağrı","ikinci el");
       Arac arac5=new Arac("05 ee 0005","Tarık","Acemi","Mazda","Amasya","Birinci el");
       Arac arac6=new Arac("06 ff 0006","İsmail","Nilüfer","Honda","Ankara","ikinci el");
       Arac arac7=new Arac("07 gg 0007","Hasan","Gül","Tofaş","Antalya","ikinci el");
       Arac arac8=new Arac("08 hh 0008","Hüseyin","Huş","Şahin","Artvin","ikinci el");
       Arac arac9=new Arac("09 ıı 0009","Elif","Muş","Ferrari","Aydın","Birinci el");
       Arac arac10=new Arac("10 kk 0010","Hatice","kuş","Volvo","Balıkesir","Birinci el");

        Collection<Arac> araclar=new ArrayList<>();
        araclar.add(arac1);
        araclar.add(arac2);
        araclar.add(arac3);
        araclar.add(arac4);
        araclar.add(arac5);
        araclar.add(arac6);
        araclar.add(arac7);
        araclar.add(arac8);
        araclar.add(arac9);
        araclar.add(arac10);

        System.out.println(araclar);

       aracSorgu(araclar);

    }

    private static void aracSorgu(Object araclar) {


    }
}
