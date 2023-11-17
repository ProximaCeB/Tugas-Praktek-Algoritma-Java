import java.util.Scanner;

public class ProgramUrutanData {
    public static void main(String[]agrs){
        try (Scanner data = new Scanner(System.in)){
            int data1, data2, data3;
            System.out.print("Masukan data 1 : ");
            data1=data.nextInt();
            System.out.print("Masukan data 2 : ");
            data2=data.nextInt();
            if(data1 > data2){
                data3 = data1;
                data1 = data2;
                data2 = data3;
                System.out.println("urutan data adalah : " + data1+ ", " +data2);
            }else{
                System.out.println(data1+""+data2);
            }
        }
    }
}
