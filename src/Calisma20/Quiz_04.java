package Calisma20;

public class Quiz_04 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin,
         String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise
          ortadaki harfi silin ve yerine :(
         */
        String str="Java candir";
        if (str.length()%2==0){
            System.out.println(str.substring(0,str.length()/2).concat(":)")+str.substring(str.length()/2));
        }else System.out.println(str.substring(0,str.length()/2).concat(":(")+str.substring(str.length()/2));
    }
}
