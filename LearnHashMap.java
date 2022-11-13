import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();

        mp.put("abc", "value");

        if(mp.putIfAbsent("abc", "value") == null)
        {
            System.out.println("null returned");
        }
        else
        {
            System.out.println(mp.putIfAbsent("abc", "abcd"));
            System.out.println("something else returned");
        }

        System.out.println("state of map is as follows");
        System.out.println(mp);
    }
}
