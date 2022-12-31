package Calisma17;

import java.util.Scanner;

public class Soru07 {
    /*
    Soru 44-)
    Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
    Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın
    ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
    Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
    Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
    Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
     */


    public static void main(String[] args) {

        String OgrenciAdi="Ahmet";
        String OgrenciSoyadi="Bulutluoz";
        int OgrenciNo=2022;
        Changename(OgrenciAdi,OgrenciSoyadi,OgrenciNo);


    }public static void Changename(String isim,String soyisim,int numara){


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        soyisim=scan.nextLine();
        System.out.println("Lütfen numaranızı giriniz");
        numara=scan.nextInt();

        System.out.println("Öğrenci ismi : "+isim+"\n"+
                            "Öğrenci Soyisimi : "+Changesurname(soyisim)+"\n"+
                                "Öğrenci numarası : "+numara);



    }public static String Changesurname(String soyisim){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yeni soyisminizi giriniz");
        soyisim=scan.nextLine();

        return soyisim;
    }
}
