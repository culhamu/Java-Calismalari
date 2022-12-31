package Calisma14;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
         */
        String[] arr={ "Kemal", "Jonathan", "Mark", "Angie", "Veli" };

        int toplam=0;
        for (String each:arr) {

            toplam+= each.length();

        }
        System.out.println(toplam);
    }
}
