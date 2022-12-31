package Calisma13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soru10 {
    public static void main(String[] args) {
        /*
        Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
         ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

         */
       int arr[]=   {1,2,3,4,5,6,7,9,8};
        System.out.println(Arrays.toString(ortadakiEleman(arr)));
    }public static int[] ortadakiEleman(int[] arr){

        int ortEleman=arr[arr.length/2];
        int[] ortArray={ortEleman};


        return ortArray;
    }
}
