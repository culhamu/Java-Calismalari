package Calisma18;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {

        /*Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
        toplamını konsola yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 tane double sayı giriniz");
        double dbl1=scan.nextDouble();
        double dbl2=scan.nextDouble();
        double dbl3=scan.nextDouble();

        System.out.println("Sayilarin toplamı:"+(dbl1+dbl2+dbl3));

        System.out.println("====================================");


        /*
        Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
         değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
         */

        int int1=12;
        long lng1=13L;
        float flt1=1555123f;

        System.out.println("Sayıların Carpımı:"+(int1*lng1*flt1));

        System.out.println("====================================");

        /*
        Basit faizi bulmak için bir kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        İlker 1000 lirasını bir yıl boyunca %10 faiz oranına sahip vadeli mevduat hesabına yatırmıştır.
        Bir yılsonunda İlker ne kadar faiz alır?

         */
        int A=1000,O=6,Y=3;
        int BasitFaiz=(A*O*Y)/100;
        System.out.println("Basit faiz degeri:"+BasitFaiz);

        System.out.println("===============================");

        /*
        Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        toplamını ve çarpımını String ile yazdırınız.
         */

            String str="Java guzeldir";
            long lng3=1254L,lng2=2155L;
            String tpl=str+((long)(lng2+lng3));
            String crp=str+lng2*lng3;
        System.out.println(tpl);
        System.out.println(crp);

        System.out.println("=================================");

        /*
        Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
         */

        boolean bl1= true;
        boolean bl2=false;

        System.out.println(bl1+" "+bl2);



    }
}
