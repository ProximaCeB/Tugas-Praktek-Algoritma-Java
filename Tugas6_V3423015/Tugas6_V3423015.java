import java.util.Scanner;
public class Tugas6_V3423015 {
    public static void main (String[]abc){
        try (Scanner data = new Scanner (System.in)) {
            double mat, algo, hasilmat, hasilalgo, total;
        System.out.println("nomor 1");
            System.out.print("masukan nilai matematika anda : ");
            mat = data.nextDouble();
            System.out.print("masukan nilai algoritma anda : ");
            algo = data.nextDouble();
            hasilmat = mat * 2 / 5;
            hasilalgo = algo * 3 / 5;
            total = ((mat * 2) + (algo * 3)) / 5;
            System.out.println("maka bobot nilai matematika anda adalah : " + hasilmat);
            System.out.println("maka bobot nilai algoritma anda adalah : " + hasilalgo);
            System.out.println("maka bobot total nilai anda adalah : " + total);
        System.out.println("nomor 2");
            double x,y,z;
            System.out.print("masukan nilai x : ");
            x = data.nextDouble();
            System.out.print("masukan nilai y : ");
            y = data.nextDouble();
            z = x;
            x = y;
            y = z;
            System.out.println("nilai x = " + x + "\n" + "nilai y = " + y);
        System.out.println("nomor 3");
            int jamawal, menitawal, detikawal;
            int jamakhir, menitakhir, detikakhir;
            int durasidetikawal, durasidetikakhir, durasidetiksisa, durasijam, durasijamsisa, durasimenit, durasimenitsisa;
            System.out.print("masukan nilai jam mulai : ");
            jamawal = data.nextInt();
            System.out.print("masukan nilai menit mulai : ");
            menitawal = data.nextInt();
            System.out.print("masukan nilai detik mulai : ");
            detikawal = data.nextInt();
            System.out.print("masukan nilai jam sekarang : ");
            jamakhir = data.nextInt();
            System.out.print("masukan nilai menit sekarang : ");
            menitakhir = data.nextInt();
            System.out.print("masukan nilai detik sekarang : ");
            detikakhir = data.nextInt();
            durasidetikawal = jamawal * 3600 + menitawal * 60 + detikawal;
            durasidetikakhir = jamakhir * 3600 + menitakhir * 60 + detikakhir;
            durasidetiksisa = durasidetikakhir - durasidetikawal;
            durasijam = durasidetiksisa / 3600;
            durasijamsisa = durasidetiksisa % 3600;
            durasimenit = durasijamsisa / 60;
            durasimenitsisa = durasijamsisa % 60;
            System.out.println("waktu tersisa " + durasijam + ":" + durasimenit + ":" + durasimenitsisa);
        }
    }
}
