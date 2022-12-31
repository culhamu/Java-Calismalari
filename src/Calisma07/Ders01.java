package Calisma07;

import java.util.Scanner;

public class Ders01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
             System.out.println("Lütfen bir tamsayı yazınız");
                    int sayi1= scan.nextInt();
             System.out.println("Lütfen bir tamsayı yazınız");
                    int sayi2= scan.nextInt();

             System.out.println("Lütfen bir tamsayı yazınız");
                    int sayi3= scan.nextInt();


            int maks=0;

            if (sayi1>=sayi2&&sayi1>=sayi3){
                maks=sayi1;
            } else if (sayi2>=sayi1&&sayi2>=sayi3) {
                maks=sayi2;

            }else {
                maks=sayi3;
            }
        System.out.println("maksimum değer:"+maks);


    }

}
