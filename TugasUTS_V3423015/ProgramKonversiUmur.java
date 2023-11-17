import java.util.Scanner;
public class ProgramKonversiUmur {
    public static void main(String[]args){
        try(Scanner data = new Scanner(System.in)){
        //Deklarasi
            int Tl, Bl, Hl;
            int Ts, Bs, Hs;
            int Tsl, Bsl, Hsl;
            int Th, Ht, Bh;
            int Ta, Ba, Ha;
        //Input
            System.out.println("         Program Konversi Umur");
            System.out.println("=======================================");
            System.out.print("Masukan tanggal lahir anda (1 - 30) : "); 
            Hl = data.nextInt();
            System.out.print("  Masukan bulan lahir anda (1 - 12) : ");
            Bl = data.nextInt();
            System.out.print("           Masukan tahun lahir anda : ");
            Tl = data.nextInt();
            System.out.print("  Masukan tanggal sekarang (1 - 30) : ");
            Hs = data.nextInt();
            System.out.print("    Masukan bulan sekarang (1 - 12) : ");
            Bs = data.nextInt();
            System.out.print("             Masukan tahun sekarang : ");
            Ts = data.nextInt();
        //Program
            System.out.println("------------------------------------------------");
        //Validasi inputan
            if (Tl > Ts) {
                System.out.println("Tidak valid");
            } else {
            //Tahun ke hari
                Tsl = Ts - Tl;
                Th = Tsl * 12 * 30;
            //Bulan ke hari
                Bsl = Bs - Bl;
                Bh = Bsl * 30;
            //Total hari
                Hsl = Hs - Hl;
                Ht = Th + Bh + Hsl;
            //Konversi hari ke tahun dan bulan
                Ta = Ht / 360;
                Ht = Ht % 360;
                Ba = Ht / 30;
                Ha = Ht % 30;
            //Menampilkan hasil
                System.out.println("Umur anda " + Ta + " tahun " + Ba + " bulan " + Ha + " hari");
            }
        }
            
    }
}
