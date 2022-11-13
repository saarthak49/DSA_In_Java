import java.util.Random;
import java.util.UUID;

public class LearnRandom {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        System.out.println(UUID.randomUUID());
    }
}
