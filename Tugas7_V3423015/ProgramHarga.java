
import java.util.Scanner;
public class ProgramHarga {
	public static void main( String[] args )
	{
		try (Scanner data = new Scanner(System.in)) {
            double harga;
            double HargaAkhir;
            double HargaDiskon;
            System.out.print("Masukan harga barang yang ingin anda beli : ");
            harga=data.nextDouble();
            if (harga >= 100000){
            	HargaAkhir = harga - (harga * 10 / 100);
            	HargaDiskon = harga - HargaAkhir;
            	System.out.println("Selamat anda mendapat diskon sebesar : " + HargaDiskon + "\n" + "Barang anda menjadi berharga : " + HargaAkhir);
            }else if(harga >= 50000){
            	HargaAkhir = harga - (harga * 5 / 100);
            	HargaDiskon = harga - HargaAkhir;
            	System.out.println("Selamat anda mendapat diskon sebesar : " + HargaDiskon + "\n" + "Barang anda menjadi berharga : " + HargaAkhir);
            }else{
            	System.out.println("Barang anda berharga " + harga);
            }
        }
    }
}