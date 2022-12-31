package Calisma14;

import java.util.Arrays;

public class array8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        büyük öğeler arasındaki farkı konsolda yazdırınız.
         */
        int[] arr={3,5,45,8,98,12,2,6};

        Arrays.sort(arr);

        int fark=arr[arr.length-1]-arr[0];
        System.out.println(fark);
    }
}
