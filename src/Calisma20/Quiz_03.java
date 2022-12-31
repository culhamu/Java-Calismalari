package Calisma20;

public class Quiz_03 {
    public static void main(String[] args) {

       /* Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın.
        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
        */
        int icilenCay=8;
        int kllnlnSeker=2;
        double yillikSeker=(365*kllnlnSeker*icilenCay*1.5)/1000;
        System.out.println(yillikSeker);
    }
}
