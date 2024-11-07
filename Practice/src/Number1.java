import java.util.Random;

public class Number1 {
    public static void main(String[] args) {
        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.println(i + " " +array[i]);
        }
    }
}