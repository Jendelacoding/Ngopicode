import java.util.Scanner;

public class Latihan1 {
        public static void main(String[] args){
        try (Scanner input = new Scanner (System.in)) {
            System.out.println( "        KEDAI LE'LAGI      ");
            System.out.println( "JALAN. KAMPUMG SUNGAI BULOH");
            System.out.println( "===========================");
            System.out.println( "===========================");

            System.out.println( ">MENU MARTABAK:             ");
            System.out.println( " 1.Martabak coklat          ");
            System.out.println( " 2.Martabak keju            ");
            System.out.println( " 3.Martabak nanas           ");
            System.out.println( " 4.Martabak telur           ");
            System.out.println( " 5.Martabak telur asin      ");

            System.out.print(
                "Pilih menu no = ");
            int makanan = input.nextInt();

            System.out.print("Berapa Porsi = ");
            int jum_porsi = input.nextInt();

            int total_makan = 0;
            String nama_makanan = null;

            switch (makanan) {
                case 1:
                    total_makan = jum_porsi * 6;
                    nama_makanan = "Nasi Lemak";
                    System.out.println("Nasi Lemak " + jum_porsi+ " Porsi: Rm."+ total_makan);
                    break;

                case 2:
                    total_makan = jum_porsi * 25;
                    nama_makanan = "Bugger";
                    System.out.println("Bugger " + jum_porsi+ " Porsi: Rm."+ total_makan);
                    break;    
                
                case 3:
                    total_makan = jum_porsi * 1;
                    nama_makanan = "Roti Canai ";
                    System.out.println("Roti Canai " + jum_porsi+ " Porsi: Rm."+ total_makan);
                    break;

                case 4:
                    total_makan = jum_porsi * 15;
                    nama_makanan = "Nasi Kandar";
                    System.out.println("Nasi Kandar " + jum_porsi+ " Porsi: Rm."+ total_makan);
                    break;       
                
                case 5:
                    total_makan = jum_porsi * 10;
                    nama_makanan = "Sate Madura ";
                    System.out.println("Sate Madura " + jum_porsi+ " Porsi: Rm."+ total_makan);
                    break;  
                    
                default:
                System.out.println("Pilihan tidak tersedia");    
            }



            System.out.println( "                         ");
            System.out.println( " ========================");
            System.out.println( "                         ");
            System.out.println( ">PILIH MENU MINUMAN :    ");
            System.out.println( " 1.TEH AIS"            );
            System.out.println( " 2.TEH TARIK"          );
            System.out.println( " 3.Teh HANGAT"         );
            System.out.println( " 4.NESCAPE AIS"        );
            System.out.println( " 5.NESCAPE HANGAT"     );

            System.out.print("Pilih menu no = ");
            int minuman = input.nextInt();

            System.out.print("Berapa porsi= ");
            int jum_gelas = input.nextInt();

            String nama_minum = null;
            int total_minum = 0;

            switch (minuman) {
                case 1:
                    total_minum = jum_porsi * 3;
                    nama_minum = "Teh ais";
                    System.out.println("Teh ais" + jum_gelas+ "Gelas = Rm." +total_minum);
                    break;

                case 2:
                    total_minum = jum_porsi * 2;
                    nama_minum = "Teh tarik";
                    System.out.println("Teh tarik" + jum_gelas+ " Gelas = Rm." +total_minum);
                    break;

                case 3:
                    total_minum = jum_porsi * 4;
                    nama_minum = "Teh hangat";
                    System.out.println("Teh hangat" + jum_gelas+ " Gelas = Rm." +total_minum);
                    break;

                case 4:
                    total_minum = jum_porsi * 5;
                    nama_minum = "NESCAPE AIS";
                    System.out.println("NESCAPE AIS" + jum_gelas+ " Gelas = Rm." +total_minum);
                    break;

                case 5:
                    total_minum = jum_porsi * 5;
                    nama_minum = "NESCAPE HANGAT";
                    System.out.println("NESCAPE HANGAT" + jum_gelas+ " Gelas = Rm." +total_minum);
                    break;
            }

            int jum_semua;
            jum_semua = total_makan + total_minum;

            System.out.println("                         ");
            System.out.println("                         ");
            System.out.println("----Daftar pembelian---- ");
            System.out.println("                         ");
            System.out.println("Makanan           =    " +nama_makanan);
            System.out.println("Jumlah Porsi      =    " +jum_porsi);
            System.out.println("Minuman           =    " +nama_minum);
            System.out.println("Jumlah Gelas      =    " +jum_gelas);
            System.out.println("                         ");
            System.out.println("                         ");
            System.out.println("===========================");
            System.out.println("Total Pembayaran  =    Rm."+jum_semua);
            System.out.println("                         ");
            System.out.println("                         ");
            
        }
    }
}
