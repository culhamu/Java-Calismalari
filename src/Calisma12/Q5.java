package Calisma12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        liste olarak dondurecek bir method olusturun.
         */
        System.out.println(isimListOlustur());

    }public static List<String> isimListOlustur(){
        List<String> isimlist=new ArrayList<>();
        String girilenIsim="";

        Scanner scan=new Scanner(System.in);


        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Lütfen eklemek istedğiniz ismi giriniz\n Bitirmek için Q ya basınız");
            girilenIsim=scan.nextLine();
          if (!girilenIsim.equalsIgnoreCase("q")){
              isimlist.add(girilenIsim);
          }

        }


       return isimlist;
    }
}
