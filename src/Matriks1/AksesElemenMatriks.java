package Matriks1;

public class AksesElemenMatriks {

    public static void main(String[] args) {

	int [][] matriks = new int[][] {
            {34, 56, 41},
            {45, 36, 37},
            {51, 32, 46}
	    };
        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[0].length; j++){
                System.out.print(matriks[i][j] + "\t");
        }
        System.out.println();
    }
        System.out.println();
        System.out.println("Akses Elemen Matriks[1][1] = " + matriks[1][1]);
        System.out.println("--------------------------");
        System.out.println("Jawaban Nomor 1");
        System.out.println("--------------------------");
        System.out.println("Ihza Maulana Zakiya");
        System.out.print("20090049");
    }
}
