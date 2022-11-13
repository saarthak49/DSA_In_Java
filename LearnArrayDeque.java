import java.util.*;


public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offerLast(4);
        arrayDeque.offerLast(5);
        arrayDeque.offerLast(6);
        arrayDeque.offerLast(7);
        arrayDeque.offerLast(8);
        arrayDeque.offerLast(9);
        arrayDeque.offerFirst(3);
        arrayDeque.offerFirst(2);
        arrayDeque.offerFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.pollFirst();
        arrayDeque.pollFirst();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        arrayDeque.pollLast();
        arrayDeque.pollLast();
        System.out.println(arrayDeque);

    }
}
