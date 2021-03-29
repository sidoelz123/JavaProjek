package Matriks3;

public class PerkalianMatriks {
    public static void main(String[] args) {
        int matriks1[][] = {
                {20,21,38},
                {12,14,45}
        };

        int matriks2[][] = {
                {53,65},
                {14,22},
                {7,19}
        };

        int matriks3[][] = new int[matriks1.length][matriks2[0].length];
        for(int x = 0; x < matriks1.length; x++){
            for(int y = 0; y < matriks2[0].length; y++){
                for(int z = 0; z < matriks1[0].length; z++){
                    matriks3[x][y] += matriks1[x][z] * matriks2[z][y];
                }
            }
        }
        for(int[] c: matriks3){
            for(int q: c){
                System.out.print(q+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        System.out.println("Jawaban Nomor 3");
        System.out.println("--------------------------");
        System.out.println("Ihza Maulana Zakiya");
        System.out.print("20090049");
    }
}
