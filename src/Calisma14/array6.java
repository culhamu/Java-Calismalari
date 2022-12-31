package Calisma14;

public class array6 {
    public static void main(String[] args) {
        /*
        Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
         */
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        Integer sum = 0;
        for(String w : arr){
            sum+=w.length();
        }
        System.out.println(sum);
    }
}
