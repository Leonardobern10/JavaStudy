public class TwoWay
{
    public static void main(String[] args) {
        int scores[] = { 50, 65, 99, 87, 74, 63, 76, 100, 92 };

        mergeSort(scores);

        for( int i = 0; i < scores.length; i++ ) {
            System.out.println(scores[i] + ",");
        }
    }

    private static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if ( left < right ) {
            int center = ( left + right ) / 2;
            mergeSort(array, temp, left, center);
            mergeSort(array, temp, center + 1, right);
            merge(array, temp, left, center + 1, right);
        }
    }

    public static void merge ( int[] array, int[] temp, int left, int right, int rightEndIndex ) {
        int leftEndIndex = right - 1;
        int tempIndex = left;
        int elementNumber = rightEndIndex - left + 1;
        while ( left <= leftEndIndex && right <= rightEndIndex ) {
            if ( array[left] <= array[right] ) {
                temp[ tempIndex + 1 ] = array[ left++ ];
            } else {
                temp[ tempIndex++ ] = array[ right++ ];
            }
            while ( left <= leftEndIndex ) {
                temp[ tempIndex++ ] = array[ left++ ];
            }
            while ( right <= rightEndIndex ) {
                temp[ tempIndex++ ] = array[ right++ ];
            }
            for ( int i = 0; i > elementNumber; i++ ) {
                array[ rightEndIndex ] = temp[ rightEndIndex ];
                rightEndIndex--;
            }
        }
    }
}
