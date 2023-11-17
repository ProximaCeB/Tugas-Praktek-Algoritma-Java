import java.util.Scanner;
public class ProgramGajiGolongan {
    public static void main(String[] args) {
        try (Scanner data = new Scanner(System.in)) {
        //Deklarasi
            String K;
            String a;
            int Gol;
            int Tu;
            int Gaji = 0;
            int A = 0;
            int Ta = 100000;
            int Tk = 300000;
            int Pjk;
            String Tv = "Tidak valid";
        //Input
            System.out.println("--Program Gaji Golongan--");
            System.out.println("1. Golongan 1");
            System.out.println("2. Golongan 2");
            System.out.println("3. Golongan 3");
            System.out.println("========================");
            System.out.print("Masukan golongan anda : ");
            Gol = data.nextInt();data.nextLine();
        //Program
        //Penentuan golongan
            switch (Gol) {
                case 1:
                    Gaji = 1000000;
                    break;
                case 2:
                    Gaji = 2000000;
                    break;
                case 3:
                    Gaji = 3000000;
                    break;
                default:
                    Gol = 0;
                    break;
            }
            if (Gol == 0) {
                System.out.println(Tv);
        //Penentuan berkeluarga
            } else {
                System.out.print("Apakah anda sudah berkeluarga? (Sudah/Belum) : ");
                K = data.nextLine();
            //Penentuan memiliki anak
                if (K.equals("Sudah")) {
                    System.out.print("Apakah anda memiliki anak? (Iya/Tidak) : ");
                    a = data.nextLine();
                //Penentuan jumlah anak
                    if (a.equals("Iya")) {
                        System.out.print("Berapa jumlah anak anda? : ");
                        A = data.nextInt();
                        switch (A) {
                            case 1:
                                A = 1;
                                break;
                            case 2:
                                A = 2;
                                break;
                            case 3:
                                A = 3;
                                break;
                            default:
                                A = 3;
                                break;
                        }
                    //Validasi input
                        if (A <= 0) {
                            System.out.println(Tv);
                        } else {
                        //Menghitung golongan 3 yang mempunyai pajak 2%
                            if (Gol == 3) {
                                System.out.println("        Tunjangan keluarga : " + Tk);
                                Tu = Ta * A;
                                System.out.println("            Tunjangan anak : " + Tu);
                                Tu = Tk + Tu;
                                System.out.println("           Tunjangan total : " + Tu);
                                Gaji = Gaji + Tu;
                                Pjk = Gaji * 2 / 100;
                                System.out.println("Dikenakan pajak sebesar 2% : " + Pjk);
                                Gaji = Gaji - Pjk;
                                System.out.println("                 Gaji anda : " + Gaji);
                        //Menghitung golongan 1 atau 2
                            } else {
                                System.out.println("Tunjangan keluarga : " + Tk);
                                Tu = Ta * A;
                                System.out.println("    Tunjangan anak : " + Tu);
                                Tu = Tk + Tu;
                                System.out.println("   Tunjangan total : " + Tu);
                                Gaji = Gaji + Tu;
                                System.out.println("         Gaji anda : " + Gaji);
                            }
                        }
                //Menghitung tanpa tunjangan anak
                    } else if (a.equals("Tidak")) {
                    //Menghitung golongan 3 yang mempunyai pajak 2%
                        if (Gol == 3) {
                            Gaji = Gaji + Tk;
                            Pjk = Gaji * 2 / 100;
                            Gaji = Gaji - Pjk;
                            System.out.println("Dikenakan pajak sebesar 2% : " + Pjk);
                            System.out.println("        Tunjangan keluarga : " + Tk);
                            System.out.println("                 Gaji anda : " + Gaji);
                    //Menghitung golongan 1 atau 2
                        } else {
                            Gaji = Gaji + Tk;
                            System.out.println("Tunjangan keluarga : " + Tk);
                            System.out.println("         Gaji anda : " + Gaji);
                        }
                //Validasi inputan
                    } else {
                        System.out.println(Tv);
                    }
            //Menghitung tanpa tunjangan
                } else if (K.equals("Belum")) {
                //Menghitung golongan 3
                    if (Gol == 3) {
                        Pjk = Gaji * 2 / 100;
                        Gaji = Gaji - Pjk;
                        System.out.println("Dikenakan pajak sebesar 2% : " + Pjk);
                        System.out.println("                 Gaji anda : " + Gaji);
                //Menghitung golongan 1 atau 2
                    } else {
                        System.out.println("Gaji anda : " + Gaji);
                    }
            //Validasi inputan
                } else {
                    System.out.println(Tv);
                }
            }
        }
    }
}
