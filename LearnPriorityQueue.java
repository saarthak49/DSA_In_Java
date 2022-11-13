import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(7);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        System.out.println(priorityQueue);

        while(!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.peek());
            priorityQueue.poll();
        }
    }
}
