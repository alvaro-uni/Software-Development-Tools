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

        System.out.println("Disordered array :");
        System.out.println(Arrays.toString(table));

        Arrays.sort(table);

        System.out.println("Ordered array:");
        System.out.println(Arrays.toString(table));
    }
}
