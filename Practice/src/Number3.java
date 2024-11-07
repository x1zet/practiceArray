public class Number3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }

        System.out.println(summ);
    }
}
