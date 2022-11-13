import java.util.*;

class MyComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(4);
        set.add(2);
        set.add(7);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        for(Integer i: set)
        {
            System.out.println(i);
        }
    }

}
