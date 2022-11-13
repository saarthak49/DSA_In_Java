import java.util.*;

public class LearnLinkedHashMap implements Cloneable{
    public static void main(String[] args) {
        NavigableMap<String, String> mp = new TreeMap<>();

        mp.put("saarthak", "one");
        mp.put("prakash", "two");
        mp.put("gupta", "three");


        System.out.println(mp.firstEntry());


    }
}
