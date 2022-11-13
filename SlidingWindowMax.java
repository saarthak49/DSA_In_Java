import java.util.ArrayDeque;
import java.util.Queue;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int arr[] = new int[n - k + 1];

        for(int i = 0; i<=k-1; i++)
        {
            if(deque.isEmpty() || nums[i] < nums[deque.peekLast()])
            {
                deque.offerLast(i);
            }
            else
            {
                while(!deque.isEmpty() && nums[deque.pollLast()] <= nums[i])
                {
                    deque.pollLast();
                }
                deque.offerLast(i);
            }
        }

        arr[0] = nums[deque.peekFirst()];
        int p = 1;

        for(int i = k; i<=n-1; i++)
        {
            if(deque.isEmpty() || nums[i] < nums[deque.peekLast()])
            {
                deque.offerLast(i);
            }
            else
            {
                while(!deque.isEmpty() && nums[deque.pollLast()] <= nums[i])
                {
                    deque.pollLast();
                }
                deque.offerLast(i);
            }

            while(!deque.isEmpty() && deque.peekFirst() < i - k + 1)
                deque.pollFirst();



            arr[p++] = nums[deque.peekFirst()];

        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int ans[] = maxSlidingWindow(arr, 3);

        for(int i: ans)
            System.out.print(i + " ");
    }
}
