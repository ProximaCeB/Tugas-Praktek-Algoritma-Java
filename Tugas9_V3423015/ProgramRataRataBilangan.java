import java.util.Scanner;

public class ProgramRataRataBilangan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
            int n, b = 1;
            float a = 0, t = 0, r;
            System.out.println("=== Program Menentukan Rata-rata pada Bilangan yang Telah Ditentukan ===" + "\n");
            System.out.print("Berapa bilangan yang ingin anda masukan : ");
            n = data.nextInt();
            if (n <= 0) {
                while(b <= n){
                    System.out.print("Masukan nilai bilangan : ");
                    a = data.nextFloat(); 
                    t = t + a;
                    b++;
                }
                r = t / n;
                System.out.println("Rata-rata dari data tersebut adalah : " + r);
            } else {
                System.out.println("Tidak Valid");
            }
        }
    }
}