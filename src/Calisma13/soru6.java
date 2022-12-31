package Calisma13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru6 {
    public static void main(String[] args) {
        /*
        Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak
         son karakterden başlayıp tersten yazdırın
         */
        String str="Kodlama harika.";
        String[] arr=str.split("");
        String tersStr="";

        for (int i = arr.length-1; i >=0 ; i--) {

            tersStr+=arr[i];

        }
        System.out.println(tersStr);

    }
}
