package Calisma09;

public class Soru_09 {
    public static void main(String[] args) {
        /*
        Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
         */
        int toplam=0;
        int sayi=6;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }

        }if (sayi==toplam){
            System.out.println(sayi+" mükemmel sayıdır");
        }else System.out.println("sayı mükemmel sayı değildir");
    }
}
