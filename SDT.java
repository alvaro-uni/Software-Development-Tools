import java.util.Arrays;
import java.util.Random;

public class SDT {
    public static void main(String[] args) {

        int[] table = new int[10];
        Random rand = new Random();
        int n = 0;
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
        }

        System.out.println("Showing disordered array :");
        System.out.println(Arrays.toString(table));

        bubbleSort(table);

        System.out.println("Ordered array:");
        System.out.println(Arrays.toString(table));
    }
    static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

}
