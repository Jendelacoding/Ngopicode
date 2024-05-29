import java.util.Scanner;

public class Latihan5 {
    private static float Sn;    // deklarasi untuk menentukan rumus aritmatika dan deret geometri
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner (System.in)) {
            int pilihan;
            do {
                System.out.println("\n === Program Fungsi === ");
                System.out.println("1 : Barisn Aritmatika" + "\n" + "2 : Deret Geometri" + "\n" + "3 : Selesai");
                System.out.print(" Masukkan pilihan anda : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1: {
                        Aritmatika();
                        break;
                    }
                    case 2: {
                        Geometri();
                        break;
                    }
                }
            }
            while (pilihan !=3);
        }
    }
    
    private static void Aritmatika() {
        try (Scanner input = new Scanner (System.in)) {
            int n, a, b;
            System.out.print("Masukkan Nilai :n ");
            n= input.nextInt();
            System.out.print("Masukkan nilai a: ");
            a= input.nextInt();
            System.out.print("Masukkan nilai b: ");
            b= input.nextInt();
            for (int x =0; x < n; x++) {
                System.out.print(a + ",");
                a = a + b;
            }
        }
    }
    private static void Geometri () {
        try (Scanner input = new Scanner (System.in)) {
            int n, x, y;
            System.out.print("Masukkan Nilai x: ");
            x= input.nextInt();
            System.out.print("Masukkan Nilai y: ");
            y= input.nextInt();
            System.out.println("Masukkan Nilai n: ");
            n= input.nextInt();
            Sn = (x*(y^n-1)) /(y-1);
        }
        System.out.println("Hasilnya Adalah : "+ Sn );
}
}