package Calisma03;

import java.util.Scanner;

public class Ders07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Çemberin Yarıçapını Giriniz");
        int r= scan.nextInt();
        int cemberAlani=(r*r),cemberinCevresi=2*r;
        System.out.println("Alan:"+cemberAlani+" "+"Çevre:"+cemberinCevresi);
    }
}
