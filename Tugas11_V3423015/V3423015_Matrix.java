import java.util.Scanner;
public class V3423015_Matrix {

    public static void main(String[] args) {
        
        int a = 0, b = 0, c = 3;
        int [][] A = new int[c][c];
        char aa = 'A';
        System.out.println("Input matrix A: ");
        Input(a, b, c, A, aa);
        int d = 0, e = 0;
        int [][] B = new int[c][c];
        char bb = 'B';
        System.out.println("Input matrix B: ");
        Input(d, e, c, B, bb);
        System.out.println("Cetak matrix A: ");
        Cetak(a, b, c, A);
        System.out.println("Cetak matrix B: ");
        Cetak(d, e, c, B);
        System.out.println("Hasil penjumlahan kedua matrix tersebut: ");
        int [][] C = Tambah(A, B);
        Cetak(a, b, c, C);
        System.out.println("Hasil perkali kedua matrix tersebut: ");
        int [][] D = Kali(A, B);
        Cetak(a, b, c, D);
    }
    private static void Input(int x, int y, int z, int X[][], char V){
        Scanner data = new Scanner(System.in);
        for(x = 0; x < z; x++){
            for(y = 0; y < z; y++){
                System.out.print(V + "[" + (x + 1) + "][" + (y + 1) + "]:");
                X[x][y] = data.nextInt();
            }
        }
    }
    private static void Cetak(int a, int b, int c, int A[][]){
        for(a = 0; a < c; a++ ){
            System.out.print("| ");
            for(b = 0; b < c; b++ ){
                System.out.print(A[a][b] + " ");
            }
        System.out.print("|");	
        System.out.println();
        }
    }
    private static int[][] Tambah(int [][] A, int [][] B){
        int x = A.length;
        int y = A[0].length;
        int [][] C = new int [x][y]; 
        for (int z = 0; z < x; ++z) {
            for (int v = 0; v < y; ++v) {
                C[z][v] = A[z][v] + B[z][v];
            }
        }
        return C;
    }
    private static int[][] Kali(int [][] A, int [][] B){
        int x = A.length;
        int y = A[0].length;
        int z = B[0].length;
        int[][] D = new int[x][z];

        for (int a = 0; a < x; ++a) {
            for (int b = 0; b < z; ++b) {
                for (int c = 0; c < y; ++c) {
                    D[a][b] += A[a][c] * B[c][b];
                }
            }
        }
        return D;
    }
}