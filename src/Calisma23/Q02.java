package Calisma23;

public class Q02 {
    public static void main(String[] args) {
        String[][] arr={{"Ali","Zafer"},{"Betül","Hüseyin","Hasan"},{"salih"}};
        String ararnanMetin="a";
        arananMetniBulma(arr,ararnanMetin);

    }public static void arananMetniBulma(String[][] arr, String arananMetin){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println("");

        }

    }
}
