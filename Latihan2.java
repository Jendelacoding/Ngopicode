import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Nilai Ujian Mahasiswa");
            System.out.print("Nama =");
            String Nama = input.nextLine();
            System.out.print("Nilai Quiz =");
            int Quiz = input.nextInt();
            System.out.print("Nilai UAS =");
            int UAS = input.nextInt();
            System.out.print("Nilai UTS =");
            int UTS = input.nextInt();
            int total;
            total = (Quiz + UAS + UTS) / 3;
            System.out.println("total nilai = " + total);
            if ((total > 80) && (total <= 100)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "nilai akhir =A");
            } else if (total > 75 && (total <= 80)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir = B+");
            } else if (total > 69 && (total <= 75)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =B");
            } else if (total > 60 && (total < 69)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =C+");
            } else if (total > 55 && (total <= 60)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =C");
            } else if (total > 50 && (total <= 55)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =D+");
            } else if (total > 44 && (total <= 50)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =D");
            } else if (total > 0 && (total <= 44)) {
                System.out.println("Mahasiswa dengan Nama " + Nama + "Nilai akhir =E");
            }
        }

    }
}