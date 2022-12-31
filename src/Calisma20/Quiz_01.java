package Calisma20;

public class Quiz_01 {
    public static void main(String[] args) {
         /* Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim.
        Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim
        */
        int input=456;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        birlerBasamagi=input%10;//6
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;//45

        birlerBasamagi=input%10;//5
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;//4

        birlerBasamagi=input%10;//4
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        System.out.println(rakamlarToplami);
        System.out.println("*************************************");
        int input2=1453;
        int rakamlarToplami2=0;
        for (int i = 1; i <=4 ; i++) {
            rakamlarToplami2+=input2%10;
            input2=input2/10;
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami2);


    }
}
