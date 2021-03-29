package Matriks4;

import java.util.Scanner;

public class TransposeMatriks {
    public static void main(String[] args) {
        int i, j, m, n;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah baris matriks = ");
        m = sc.nextInt();
        System.out.print("Masukan jumlah kolom matriks = ");
        n = sc.nextInt();
        System.out.println("Masukan Elemen matriks = ");

        for(i = 0; i < m; i++){
            for (j=0; j<n; j++){
                matriks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Hasil Matriks = ");
        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for (i=0; i<m; i++){
            for (j=0; j<n; j++){
                transpose[j][i] = matriks[i][j];
            }
        }

        System.out.println("Hasil Transpose = ");
        for (i=0; i<n; i++){
            for (j=0; j<m; j++){
                System.out.print(transpose[i][j] + "\t");
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
