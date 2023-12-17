package Praktek;
public class Method {
    public static void main(String[] args) {
        garis();
        System.out.println("Usia : " + usia(2005, 2023));
        garis();
        String [] hobi = new String[3];
        inputhobi(hobi);
        System.out.println(hobi[0]);
    }
    private static void inputhobi(String[] hobi) {
        hobi[0]="main"; hobi[1]="makan"; hobi[2]="tidur";
    }
    public static void garis() {
        System.out.println("----------------");
    }
    public static int usia(int Ta, int Ts){
        int Usia = Ts - Ta;
        return Usia;
    }
}

