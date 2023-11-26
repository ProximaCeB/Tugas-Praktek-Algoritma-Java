package Tugas10_V3423015;

import java.util.Scanner;
import java.lang.Math;

public class ProgramDeretGeometri {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int Un, a, r, n = 1, b, l = 1, t = 0;
            System.out.print("Masukan bilangan awal : ");
            a = data.nextInt();
            System.out.print("Masukan rasio deret : ");
            r = data.nextInt();
            System.out.print("Masukan banyak bilangan : ");
            b = data.nextInt();
            while (l <= b) {
                Un = a * (int)Math.pow(r, n-1);
                if (l < b) {
                    System.out.print(Un + " + ");
                } else {
                    System.out.print(Un + " = ");
                }
                t = t + Un;
                l++;
                n++;
            }
            System.out.println(t);
        }
    }
}
