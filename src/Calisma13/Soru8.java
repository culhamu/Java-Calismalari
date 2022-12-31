package Calisma13;

import java.lang.reflect.Array;

public class Soru8 {
    public static void main(String[] args) {
        /*
        Soru 34-)
        Bir String'i parametre olarak kabul eden
         ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :  Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
         Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */
        String str = "ade1r4d3";
        System.out.println(stringdekiSayilarinToplami(str));

    }public static Integer stringdekiSayilarinToplami(String str){
        int toplam=0;

        for (int i = 0; i < str.length(); i++) {

            char chr=str.charAt(i);

            if (Character.isDigit(chr)){
                toplam+=Character.getNumericValue(chr);
            }

        }return toplam;

    }
}
