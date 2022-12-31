package Calisma18;

public class stringmanipulation3 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek: 'Ali Can' için n yazdırmalısınız.
         */
        String ism="Ali can";
        char chr=ism.charAt(ism.length()-1);
        System.out.println(chr);
        System.out.println("========================");
        /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        toplamını bulunuz.
         */
        String ism4="Sahre";
        char ilk=ism4.charAt(0);
        char son=ism4.charAt(ism4.length()-1);
        int toplam=(ilk+son);
        System.out.println(toplam);
        System.out.println("===========================");
        /*
        Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        yazdırınız.
        Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
         */
        String ism8="Kanaka";
        String son7=ism8.substring(1,6);
        System.out.println(son7);
        System.out.println("=========================");
        /*
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */
        String zxm="kalkan";
        String dsm=zxm.substring(0,5).toUpperCase();
        System.out.println(dsm);
        System.out.println("===============================");
        /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */
        String fmf="Komşu";
        String dhl=fmf.substring(1,4).toUpperCase();
        System.out.println(dhl);
        System.out.println("=========================");
        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
         */
        String str9="Ali can";
        String boslukvarmi=str9.charAt(3) ==' ' ? "bosluk var" : "bosluk yok";
        System.out.println(boslukvarmi);



    }
}
