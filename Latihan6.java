import java.util.Scanner;

public class Latihan6 {
    public static void prosesArgumen(String argumen) {
        System.out.println("  || Hasilnya adalah ||  ");
            for (int i =0; i < argumen.length(); i++);
                for (int j = 0; j <= 1; j++) {
                    System.out.print(argumen.charAt(j) + " ");
                }
            System.out.println();
    }

public static void prosesAngka(int angka) {
    System.out.println("  || Haasilnya adalah ||  ");
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) * (j + 1 ) + " ");
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(" == Program Argumen dan Angka == ");
            System.out.println("---------------------------------");
            System.out.println();

            System.out.print("Masukkan Argumen (Dalam Tipe String) : ");
            String argumen = input.nextLine();
            Latihan6.prosesArgumen(argumen);
            System.out.println();

            System.out.print("Masukkan Angka (Dalam Tipe Integrasi) : ");
            int angka = input.nextInt();
            try {
                Latihan6.prosesAngka(angka);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}