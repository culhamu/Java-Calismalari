package Calisma03;

import java.util.Scanner;

public class Ders05 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin köşe uzunluklarını giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int dikdortgeninAlani=a*b;
        System.out.println(dikdortgeninAlani);
    }
}
