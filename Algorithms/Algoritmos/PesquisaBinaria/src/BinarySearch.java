public class BinarySearch
{
    public static int search (int[] array, int item) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            if (array[meio] == item) {
                return meio;
            } else if (array[meio] > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
}
