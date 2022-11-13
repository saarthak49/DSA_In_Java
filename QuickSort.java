import java.util.*;

public class QuickSort {
    private static int inPlaceSortWithPartition(List<Integer> list, int start, int end)
    {
        int size = end - start + 1;
        Random random = new Random();
        int randomIndex = random.nextInt(size); // returns any number between 0 and size - 1
        int pivotLocation = start + randomIndex;
        int pivotElement = list.get(pivotLocation);

        Collections.swap(list, pivotLocation, end);

        int k = start;
        for (int i = start; i<=end; i++)
        {
            if(list.get(i) < pivotElement)
                Collections.swap(list, k++, i);
        }

        Collections.swap(list, k, end);

        return k;
    }

    private static void quickSort(List<Integer> list, int start, int end)
    {
        if(start >= end)
            return;
        int pivotLocation = inPlaceSortWithPartition(list, start, end);

        quickSort(list, start, pivotLocation - 1);
        quickSort(list, pivotLocation + 1, end);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, 4);
        QuickSort.quickSort(list, 0, list.size() - 1);


        System.out.println(list);
    }
}
