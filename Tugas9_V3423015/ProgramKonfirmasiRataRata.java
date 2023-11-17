import java.util.Scanner;

public class ProgramKonfirmasiRataRata {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            float a = 0, r;
            int n = 0;
            char k = 'y';
            while (k == 'y' || k == 'Y') {
                System.out.print("Masukan nilai : ");
                a = data.nextFloat();
                a = a + a;
                System.out.println(a);
                n++;
                System.out.println(n);
                System.out.print("Apakah anda ingin memasukan nilai : ");
                k = data.next().charAt(0);
            }
            r = a / n;
            System.out.println("Rata-rata data tersebut adalah : " + r);
        }
    }
}