package Calisma18;

public class stringManipulation2 {
    public static void main(String[] args) {

        /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
         */
        String ism1 ="ali can";
        String ism2="merve star";
        String ism3="mark tom";
        Integer a1=ism1.replace("\\s","").length();
        Integer a2=ism2.replace("\\s","").length();
        Integer a3=ism3.replace("\\s","").length();
        System.out.println(a1+a2+a3);

        System.out.println("=================================");

        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */
        String str="Miami 33018!!!";
        Integer str2=str.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length();
        System.out.println(str2);



    }
}
