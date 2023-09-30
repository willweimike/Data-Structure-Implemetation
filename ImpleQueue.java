import java.util.LinkedList;
import java.util.Queue;

public class ImpleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Bob");
        queue.offer("Cindy");



        System.out.println(queue.contains("Bob"));
    }
}
