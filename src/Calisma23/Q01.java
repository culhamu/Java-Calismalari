package Calisma23;

public class Q01 {
    public static void main(String[] args) {
        int [][] arr={{2,3},{1,2,3},{6,7,4,5,3},{0,5,7}};
        arraylerinToplami(arr);
    }public static int arraylerinToplami(int[][] arralerinToplami){
       int toplam=0;
        for (int i = 0; i < arralerinToplami.length; i++) {
            for (int j = 0; j < arralerinToplami[i].length; j++) {

                toplam+=arralerinToplami[i][j];

            }


        }System.out.println(toplam);
        return toplam;
    }
}
