package Calisma12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        kismini list olarak bize donduren bir method olusturun
         */
        List<String> isimler=Q5.isimListOlustur();
        System.out.println(istenmeyenKelimeler(isimler));

    }public static List<String> istenmeyenKelimeler(List<String> isimler){

        Scanner scan=new Scanner(System.in);
        System.out.println("İstenmeyen harfi yazınız");
        String isteneyenHarf=scan.next().substring(0,1);

        List<String> yeniListe=new ArrayList<>();
        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(isteneyenHarf)){
                yeniListe.add(isimler.get(i));

        }

        }return yeniListe;

    }
}
