import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("abcd");
        lst.add("fgh");

        lst = lst.stream().map(str -> str + ".xml").collect(Collectors.toList());
//        lst.forEach(str -> str = str + ".xml");
        System.out.println(lst);
    }
}
