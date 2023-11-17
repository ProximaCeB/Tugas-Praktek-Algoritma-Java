import java.util.Scanner;
public class Tugas5_V3423015 {

    public static void main (String[]abc){
        try (Scanner data = new Scanner (System.in)) {
            double alas;
            double tinggi;
            double hasil;
            double SisiMiring;
            double PangkatAlas;
            double PangkatTinggi;
            double jarijari;
            double phi = 3.14;
   //luas segitiga sama kaki
   System.out.println("\n"+"Operator Luas Segitiga");
            System.out.print("Masukan nilai alas segitiga : ");
            alas = data.nextDouble();
            System.out.print("Masukan nilai tinggi segitiga : ");
            tinggi = data.nextDouble();
            hasil = (alas*tinggi)/2;
            System.out.println("Maka hasil luas segitiga adalah : "+hasil);
   //keliling segitiga sama kaki
   System.out.println("\n"+"Operator Keliling Segitiga");
            System.out.print("Masukan nilai alas segitiga : ");
            alas = data.nextDouble();
            System.out.print("Masukan nilai tinggi segitiga : ");
            tinggi = data.nextDouble();
            //rumus phytagoras
                PangkatAlas = Math.pow(alas, 2);
                PangkatTinggi = Math.pow(tinggi, 2);
                SisiMiring = Math.sqrt(PangkatAlas+PangkatTinggi);
            hasil = SisiMiring+SisiMiring+alas;
            System.out.println("Maka hasil keliling segitiga adalah : "+hasil);
   //luas lingkaran
   System.out.println("\n"+"Operator Luas Lingkaran");
            System.out.print("Masukan nilai jari-jari : ");
            jarijari = data.nextDouble();
            hasil = phi*jarijari*jarijari;
            System.out.println("Maka hasil luas lingkaran adalah : "+hasil);
   //keliling lingkaran
   System.out.println("\n"+"Operator Keliling Lingkaran");
            System.out.print("Masukan nilai jari-jari : ");
            jarijari = data.nextDouble();
            hasil = 2*phi*jarijari;
            System.out.println("Maka hasil keliling lingkaran adalah : "+hasil);
   //luas segitiga siku-siku
   System.out.println("\n"+"Operator Luas Segitiga Siku-Siku");
            System.out.print("Masukan nilai alas segitiga : ");
            alas = data.nextDouble();
            System.out.print("Masukan nilai tinggi segitiga : ");
            tinggi = data.nextDouble();
            hasil = (alas*tinggi)/2;
            System.out.println("Maka hasil luas segitiga siku-siku adalah : "+hasil);
   //keliling segitiga siku-siku
   System.out.println("\n"+"Operator Luas Segitiga Siku-Siku");
            System.out.print("Masukan nilai alas segitiga : ");
            alas = data.nextDouble();
            System.out.print("Masukan nilai tinggi segitiga : ");
            tinggi = data.nextDouble();
                //rumus phytagoras
                PangkatAlas = Math.pow(alas, 2);
                PangkatTinggi = Math.pow(tinggi, 2);
                SisiMiring = Math.sqrt(PangkatAlas+PangkatTinggi);
            hasil = SisiMiring+tinggi+alas;
            System.out.println("Maka hasil keliling segitiga siku-siku adalah : "+hasil);
        }
    }
}