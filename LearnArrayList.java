

import java.util.*;

public class LearnArrayList
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Saarthak");
        list.add("John");
        list.add("Doe");
        list.add("Lorem");
        list.remove(list.size() - 1);
        System.out.println(list.contains("John"));
        list.remove(String.valueOf("Saarthak"));
        System.out.println(list);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(4);
        integerList.add(2);
        integerList.add(1);
        integerList.add(3);
        System.out.println(integerList);
        Collections.sort(integerList, Comparator.reverseOrder());
        System.out.println(integerList);

    }
}
