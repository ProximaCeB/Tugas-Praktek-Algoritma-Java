import java.util.Scanner;

public class ProgramKonfirmasiRataRata {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            float a = 0, t = 0, r;
            int n = 0;
            char k = 'y';
            System.out.println("=== Program Menghitung Rata-rata Menggunakan Konfirmasi ===" + "\n");
            while (k == 'y' || k == 'Y') {
                n++;
                System.out.print("Masukan nilai ke-" + n + " : ");
                a = data.nextFloat();
                t = t + a;
                System.out.print("Apakah anda ingin memasukan nilai(Ya/Tidak) : ");
                k = data.next().charAt(0);
            }
            r = t / n;
            System.out.println("Rata-rata data tersebut adalah : " + r);
        }
    }
}