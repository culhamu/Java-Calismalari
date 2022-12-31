package Calisma13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru3 {
    public static void main(String[] args) {
        /*
        Soru 30-)
Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
bu yüzden iç içe loop kullanmak mantıklı duruyor
         */
        String str="Javacokkolay";
        List<Character> list=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char chr=str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (chr==str.charAt(j)){
                    if (!list.contains(chr))

                    list.add(chr);
                    break;

                }

            }

        }System.out.println(list);

    }
}
