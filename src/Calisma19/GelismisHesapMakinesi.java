package Calisma19;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci vize notunuzu giriniz");
        int vize1= scan.nextInt();
        System.out.println("lütfen ikininci vize notunuzu giriniz");
        int vize2= scan.nextInt();
        System.out.println("lütfen final notunuzu giriniz");
        int fnl= scan.nextInt();

        double toplamnot=(vize1*0.3)+(vize2*0.3)+(fnl*0.4);
          if (toplamnot>=90) System.out.println("AA");
          else if (toplamnot>=85) System.out.println("BA");
          else if (toplamnot>=80) System.out.println("BB");
          else if (toplamnot>=75) System.out.println("CB");
          else if (toplamnot>=70) System.out.println("CC");
          else if (toplamnot>=65) System.out.println("DC");
          else System.out.println("Kaldınız");
    }

    }

