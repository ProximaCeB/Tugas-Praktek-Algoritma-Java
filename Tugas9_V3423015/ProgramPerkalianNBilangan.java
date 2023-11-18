import java.util.Scanner;

public class ProgramPerkalianNBilangan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int b, a, p = 1, t = 1;
            System.out.println("=== Program Perkalian Bilangan yang Telah Ditentukan ===" + "\n");
            System.out.print("Masukan jumlah yang ingin dimasukan : ");
            b = data.nextInt();
            while (p <= b) {
                System.out.print("Masukan bilangan : ");
                a = data.nextInt();
                t = t * a;
                p++;
            } 
            System.out.print("Hasil perkalian dari bilangan tersebut adalah : " + t);
        }
    }
}
