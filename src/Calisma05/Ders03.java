package Calisma05;

import java.util.Scanner;

public class Ders03 {
    public static void main(String[] args) {

        //Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
         int rakam= scan.nextInt();

        if (rakam==1){
            System.out.println("tatile 5 gün var");
        } else if (rakam==2) {
            System.out.println("tatile 4 gün var");

        } else if (rakam==3) {
            System.out.println("tatile 3 gün var");

        } else if (rakam==4) {
            System.out.println("tatile 2 gün var");

        } else if (rakam==5) {
            System.out.println("tatile 1 gün var");

        } else if (rakam==6 || rakam==7) {
            System.out.println("Simdi dinlenme zamani");

        }else System.out.println("hatalı gün ismi");
    }
}
