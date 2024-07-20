import java.util.ArrayList;

public class QuickSortTest
{
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(6);
        array.add(8);
        array.add(10);
        array.add(35);
        array.add(2);
        array.add(1);

        ArrayList<Integer> sortedArray = QuickSort.ordenar(array);
        System.out.println(sortedArray);
    }
}
