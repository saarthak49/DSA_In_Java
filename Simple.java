import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

class MyComparator1 implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Pair p1 = (Pair)o1;
        Pair p2 = (Pair)o2;
        return p1.a == p2.a ? 0 : p1.a > p2.a ? -1 : 1;
    }


}

class Pair
{
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return a == pair.a && b == pair.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
public class Simple {
    public static void main(String[] args) {
        System.out.println(Integer.compareUnsigned(4, 5));
    }
}
