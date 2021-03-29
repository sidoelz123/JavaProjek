package Matriks2;

public class PenguranganMatriks {
    public static void main(String[] args) {
        int matriks1 [][] = {
                {11,20},
                {40,10},
                {33,25}
        };
        int matriks2 [][]= {
                {4,5},
                {2,8},
                {3,2}
        };
        if(matriks1.length==matriks2.length && matriks1[0].length == matriks2[0].length){
        int matriks3 [][]= new int[matriks1.length][matriks1[0].length];
            for (int i = 0; i< matriks1.length; i++) {
                for (int j = 0; j < matriks1[0].length; j++){
                   matriks3[i][j] = matriks1[i][j] - matriks2[i][j];
                }
            }
            for(int[] c: matriks3){
                for(int q: c){
                    System.out.print(q+"\t");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("matriks eror");
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Jawaban Nomor 2");
        System.out.println("--------------------------");
        System.out.println("Ihza Maulana Zakiya");
        System.out.print("20090049");
    }
}
