
public class Latihan7 {
    private static void bubbleSort(int[] bilangan) {
        int n = bilangan.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bilangan[i - 1] > bilangan[j]) {
                    temp = bilangan[j - 1];
                    bilangan[i - 1] = bilangan[i];
                    bilangan[i] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] bilangan) {
        for (int i = 0; i < bilangan.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < bilangan.length; j++) {
                if (bilangan[j] < bilangan[index]) {
                    index = j;
                }
            }
        }
    }

    private static void insertionSort(int[] bilangan) {
        int n = bilangan.length;
        for (int j = 1; j < n; j++) {
            int key = bilangan[j];
            int i = j - 1;
            while ((i > -1) && (bilangan[i]) > key) {
                bilangan[i + 1] = bilangan[i];
                i--;
            }
            bilangan[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int bilangan[] = { 25, 27, 10, 8, 76, 21, 45, };
        System.out.println("==Program Sorting==");
        System.out.println("Data Sebelum Dilakukan Sorting");
        System.out.print("25 27 10 8 76 21 45 ");
        System.out.println();

        bubbleSort(bilangan);
        System.out.println("Algoritma Bbble Sort");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println();
        selectionSort(bilangan);
        System.out.println("Agoritma Selection Sort");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println();
        insertionSort(bilangan);
        System.out.println("Agoritma insertion Sort");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println();
    }
}