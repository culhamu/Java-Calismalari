package Calisma18;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {

        /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir şehir ismi giriniz");
        String shrIsmi=scan.next();
        String kullanilacakisim=shrIsmi.toUpperCase();
        System.out.println(kullanilacakisim);
        System.out.println(kullanilacakisim.substring(0,1).toUpperCase()+kullanilacakisim.substring(1).toLowerCase());
    }
}
