package Calisma17;

import java.util.Arrays;

public class soru02 {
    public static void main(String[] args) {
        /*
        Soru-40)
Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren
 bir method yazın ve ardından sonucu main methodda yazdırın.
Örn:
girdi : {1,2,3,4,5,6,7,8}
çıkış: 36
ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
         */
        int[] girdi={1,2,3,4,5,6,7,8};

        System.out.println(arrtoplam(girdi));

    }public static int arrtoplam(int[] arr){
        int toplam=0;
        for (int w:arr) {
            toplam+=w;

        }
        return toplam;
    }
}
