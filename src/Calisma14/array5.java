package Calisma14;

public class array5 {
    public static void main(String[] args) {
        /*
        Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
         */
        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "object";
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(s)){
                counter++;
            }

        }

        if (arr.length>0){
            System.out.println("Array de obje "+counter+" defa var");
        }else System.out.println("Array de eleman yoktur");


    }
}
