import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[10];
        Random rand = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100); 
        }

        System.out.println("Random values array:");
        for (int value : table) {
            System.out.println(value);
        }
    }
}
