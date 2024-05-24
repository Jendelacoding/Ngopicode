import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int faktorial, x = 1;
            System.out.println(("Program Bilangan Faktorial"));
            System.out.print("Masukan Bilangan faktorial =  ");
            faktorial = input.nextInt();
            System.out.print(faktorial + "! = ");
            while (faktorial >= 1)
                ;
            {
                System.out.print(faktorial);
                if (faktorial != 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" = ");
                }
                x = x * faktorial;
                faktorial--;
            }
        }
        System.out.println();
    }
}


