package Calisma17;

public class Soru06 {
    /*
        Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim
        sonra cagırıp konsolda yazdıralım.

         */
    String isim="Fatih";
    String renk="siyah";
    int adet=25;

    public Soru06() {
        this.adet=0;

    }
    public Soru06(String isim, String renk, int adet) {
        this.isim=isim;
        this.renk="Lacivert";
        this.adet=adet;

    }

    @Override
    public String toString() {
        return "Soru06{" +
                "isim='" + isim + '\'' +
                ", renk='" + renk + '\'' +
                ", adet=" + adet +
                '}';
    }

    public static void main(String[] args) {

        Soru06 obj1=new Soru06();
        Soru06 obj2=new Soru06("Mehmet","Mavi",28);

        System.out.println(obj1);
        System.out.println(obj2);


    }




}
