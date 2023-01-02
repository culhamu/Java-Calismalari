package Calisma26;

public class C01_arrays {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
         */
        int[] arr={5, 0, 2, 0, 3};
        int[] arr1=new int[arr.length];
        int ilkIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr1[ilkIndex]=arr[i];
               ilkIndex++;
            }


        }System.out.println(java.util.Arrays.toString(arr1));
    }
}
