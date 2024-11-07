public class Number2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,228};
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
