public class PesquisaLinear
{
    public static int search (int[] array, int number) {
        for ( int i = 0; i < array.length; i++ ) {
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
