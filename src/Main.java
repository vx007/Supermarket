import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static Queue<String> queue1 = new ArrayDeque<>(5);
    public static Queue<String> queue2 = new ArrayDeque<>(5);
    public static Random random = new Random();

    public static void main(String[] args) {

        while (queue1.size() < 6 && queue2.size() < 6) {
            System.out.println(add(String.format("name: %d", random.nextInt())));
        }

        System.out.println("Call Galina!");

        remove();
        remove();
        remove();

        System.out.println(queue1);
        System.out.println(queue2);
    }

    public static Queue<String> add(String word) {
        if (queue2.size() >= queue1.size()) {
            queue1.add(word);
            return queue1;
        } else {
            queue2.add(word);
            return queue2;
        }
    }

    public static void remove(){
        if (random.nextBoolean()){
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

}
