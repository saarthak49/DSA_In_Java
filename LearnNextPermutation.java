import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnNextPermutation {
    private static boolean getNextPermutation(List<Integer> list) {

        int n = list.size();
        int i;
        for (i = n - 1; i >= 1; i--) {
            if (list.get(i - 1) < list.get(i))
                break;
        }

        // is the list sorted in descending order
        if (i == 0)
            return false;


        // get the index just before the longest descending order sorted list in the original list
        int index = i - 1;


        for (i = n - 1; i >= 0; i--) {
            if (list.get(i) > list.get(index)) {
                Collections.swap(list, i, index);
                break;
            }
        }

        Collections.sort(list.subList(index + 1, n));
        return true;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println("original list");
        System.out.println(list);


        while (getNextPermutation(list)) {
            System.out.println("next permutation");
            System.out.println(list);
        }
    }
}
