package Matriks4;

public class TransposeMatriks {
    public static void main(String[] args) {
        int matriks[][] = {
                {2,1,-5},
                {3,4,2}
        };

        int trans[][] = new int[3][2];

        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[0].length; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Hasil Transpose");
        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[0].length ; j++){
                trans[j][i] = matriks[i][j];
            }
        }
        for(int i = 0; i < matriks[0].length; i++){
            for(int j = 0; j< matriks.length; j++){
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        System.out.println("Jawaban Nomor 4");
        System.out.println("--------------------------");
        System.out.println("Ihza Maulana Zakiya");
        System.out.print("20090049");
    }
}
