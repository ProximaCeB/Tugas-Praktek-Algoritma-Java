package Tugas10_V3423015;

import java.util.Scanner;

public class ProgramFPB {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int b1, b2, temp, F = 1;
            System.out.print("Masukan bilangan pertama : ");
            b1 = data.nextInt();
            System.out.print("Masukan bilangan kedua : ");
            b2 = data.nextInt();
            if (b1 > b2) {
                temp = b1;
                b1 = b2;
                b2 = temp;
            }
            while (F != 0) {
                F = b2 % b1;
                b2 = b1;
                b1 = F;
            }
            System.out.println("FPB = " + b2 );
        }
    }
}
