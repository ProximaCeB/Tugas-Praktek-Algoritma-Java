/**
 * Tugas4_V3423015
 */
public class Tugas4_V3423015 {

    public static void main(String[]agrs){
        //Operator Aritmatika
		System.out.println("\n");
		System.out.println("Operator Aritmatika");
        int var1 = 12;
        int var2 = 3;
        int var3 = 7;
		int var4 = 12;
        int hasil;
		int x = 100 / 3;
		System.out.println(x);
            //Penjumlahan
			System.out.println("Operator Penjumlahan");
            hasil = var1 + var2;
            System.out.printf("%d + %d = %d \n",var1,var2,hasil);
            //Pengurangan
			System.out.println("Operator Pengurangan");
            hasil = var1 - var2;
            System.out.printf("%d - %d = %d \n",var1,var2,hasil);
            //Perkalian
			System.out.println("Operator Perkalian");
            hasil = var1 * var2;
            System.out.printf("%d * %d = %d \n",var1,var2,hasil);
            //Pembagian
			System.out.println("Operator Pembagian");
            hasil = var1 / var2;
            System.out.printf("%d / %d = %d\n",var1,var2,hasil);
            //Modulus
			System.out.println("Operator Modulus");
            hasil = var1 % var3;
            System.out.printf("%d %% %d = %d \n",var3,var1,hasil);
			System.out.println("\n");
		//Operator Perbandingan
		System.out.println("Operator Perbandingan");
			//Lebih dari
			System.out.println("Operator Lebih dari");
			boolean LebihDari = var1>var2;
			System.out.println(var1+" > "+var2+" = "+LebihDari);
			//lebih dari sama dengan
			System.out.println("Operator Lebih dari sama dengan");
			boolean LebihDariSamaDengan = var1 >= var4;
			System.out.println(var1+" >= "+var2+" = "+LebihDariSamaDengan);
			//Kurang dari
			System.out.println("Operator Kurang dari");
			boolean KurangDari = var3 < var2;
			System.out.println(var3+" < "+var2+" = "+KurangDari);
			//Kurang dari sama dengan
			System.out.println("Operator Kurang dari sama dengan");
			boolean KurangDariSamaDengan = var4 <= var1;
			System.out.println(var4+" <= "+ var1+" = "+KurangDariSamaDengan);
			//Sama dengan
			System.out.println("Operator Sama dengan");
			boolean SamaDengan = var2 == var3;
			System.out.println(var2+" == "+var3+" = "+SamaDengan);
			//Tidak sama dengan
			System.out.println("Operator Tidak sama dengan");
			boolean TidakSamaDengan = var3 != var2;
			System.out.println(var3+" != "+var2+" = "+TidakSamaDengan);
			System.out.println("\n");
		//Logika
		System.out.println("Operator Logika");
			//Dan
			System.out.println("Operator Dan");
			boolean Dan = LebihDari && LebihDariSamaDengan;
			System.out.println(var1+" >= "+var2+" && "+var1+" > "+var2+" = "+Dan);
			//Atau
			System.out.println("Operator Atau");
			boolean atau = SamaDengan || TidakSamaDengan;
			System.out.println(var2+" == "+var3+" || "+var3+" != "+var2+" = "+atau);
			System.out.println("\n");
		//Assignment
		System.out.println("Operator Assingment");
			int z = 20;
			System.out.println("Nilai awal = "+z);
			z+=3;
			System.out.println("Nilai setelah diberi +=3 "+z);
			z-=8;
			System.out.println("Nilai setelah diberi -=8 "+z);
			z/=3;
			System.out.println("Nilai setelah /= "+z);
			z*=2;
			System.out.println("Nilai setelah diberi *=2 "+z);
			z%=4;
			System.out.println("Nilai setelah diberi %=4 "+z);
    }

}