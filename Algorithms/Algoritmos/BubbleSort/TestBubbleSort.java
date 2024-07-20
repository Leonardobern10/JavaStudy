public class TestBubbleSort {
    public static void main(String[] args) {
        int[] scores = {60, 50, 95, 80, 70};
        sort(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ",");
        }
            System.out.println();
    }

    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[minIndex] > arrays[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minIndex] = temp;
            }
        }
    }

}
