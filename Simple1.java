import java.util.ArrayList;
import java.util.List;

public class Simple1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.set(0, 8);
        System.out.println(arr);
    }
}
