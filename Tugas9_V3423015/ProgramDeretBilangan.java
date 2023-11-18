import java.util.Scanner;

public class ProgramDeretBilangan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int a = 1, b, t = 0;
            System.out.println("=== Program Penjumlahan Deret Bilangan Asli ===" + "\n");
            System.out.print("Masukan banyak angka : ");
            b = data.nextInt();
            if (b >= a) {
                while (a <= b) {
                    t = t + a;
                    if (a == b) {
                        System.out.print(a);
                    } else {
                        System.out.print(a + " + ");
                    }
                    a++;
                }
                System.out.print(" = " + t);
            } else {
                System.out.println("Tidak Valid");
            }
        }
    }
}
