package Calisma13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru5 {
    public static void main(String[] args) {
        /*
        Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini
        Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve
        kullancıya oluşturdugunuz arrayi buna tersten assign edin...
         */
        Integer[] arr={3,5,464,48,41,32};
        List<Integer> arrReverse=new ArrayList<>();

        for (int i = arr.length-1; i >0 ; i--) {

          arrReverse.add(arr[i]);


        }
        System.out.println(arrReverse);


    }
}
