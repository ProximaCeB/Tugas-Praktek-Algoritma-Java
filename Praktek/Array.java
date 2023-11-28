package Praktek;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int i, n;
            double t, r, t1, r1;
            double [] ns;
            double [] ns1;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.print("Masukan banyak siswa : ");
            n = data.nextInt();
            ns = new double[n];
            ns1 = new double[n];
            t = 0;
            t1 = 0;
            String [] nama = new String[n];
            System.out.println("=================Nama Siswa=================");
            for(i = 0; i < n; i++){
                System.out.print("Masukan nama siswa : ");
                nama[i] = data.next();
            }
            System.out.println("=================Matematika Informatika=================");
            for(i = 0; i < n; i++){
                System.out.print("Masukan nilai Matematika Informatika siswa " + nama[i] + " : ");
                ns[i] = data.nextDouble();
                t = t + ns[i];
            }
            System.out.println("=======================Algoritma=======================");
            for(i = 0; i < n; i++){
                //System.out.print("Masukan nilai siswa ke-" + (i + 1) + " : ");//
                System.out.print("Masukan nilai Algoritma siswa " + nama[i] + " : ");
                ns1[i] = data.nextDouble();
                t1 = t1 + ns1[i];
            }
            r = t / n;
            r = Double.parseDouble(df.format(r));
            r1 = t1 / n;
            r1 = Double.parseDouble(df.format(r1));
            System.out.println("---------------------------------------------");
            System.out.println("Rata-rata nilai Matematika Informatika : " + r);
            System.out.println("Rata-rata nilai Algoritma : " + r1);
        }
    }
}
