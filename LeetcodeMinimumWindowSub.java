import java.util.HashMap;
import java.util.Map;

public class LeetcodeMinimumWindowSub {


    private static boolean compareMaps(Map<Character, Integer> a, Map<Character, Integer> b)
    {
        for(Map.Entry<Character, Integer> e: b.entrySet())
        {
            if(a.get(e.getKey()) == null || e.getValue() > a.get(e.getKey()) )
                return false;
        }
        return true;
    }


    public static String minWindow(String s, String t) {
        Map<Character, Integer> a = new HashMap<>();
        Map<Character, Integer> b = new HashMap<>();

        int m = s.length();
        int n = t.length();

        for(int i = 0; i<=n-1; i++)
        {
            if(b.containsKey(t.charAt(i))) {
                int val = b.get(t.charAt(i));
                val += 1;
                b.put(t.charAt(i), val);
            }
            else
                b.put(t.charAt(i), 1);
        }

        int i = 0;
        int j = 0;
        int minLength = Integer.MAX_VALUE;
        int startPoint = -1;

        for(; i<=m-1; i++)
        {
            if(a.containsKey(s.charAt(i))) {
                int val = a.get(s.charAt(i));
                val += 1;
                a.put(s.charAt(i), val);
            }
            else
                a.put(s.charAt(i), 1);

            while(compareMaps(a, b) && j<=i)
            {
                int length = i - j + 1;
                if(length < minLength)
                {
                    minLength = length;
                    startPoint = j;
                }

                int val = a.get(s.charAt(j));
                val -= 1;
                a.put(s.charAt(j), val);
                j++;
            }


        }


        if(startPoint == -1)
            return "";
        return s.substring(startPoint, startPoint + minLength);


    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}
