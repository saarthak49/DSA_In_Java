import java.util.*;


public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
