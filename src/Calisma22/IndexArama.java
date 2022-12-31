package Calisma22;

public class IndexArama {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis
         */
        String str="Java ogren issiz kalma is bul";
        String aranacakMtn="cok";
        if (!(str.contains(aranacakMtn))){
            System.out.println("String aranan metni icermiyor");
        } else if (str.indexOf(aranacakMtn)==str.lastIndexOf(aranacakMtn)) {
            System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
            
        }else System.out.println("Aranan metin String’de 1’den fazla kullanilmis");
    }
}
