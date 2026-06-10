import java.util.*;

public class DequeInJava {
    public static void main(String args[]) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.add("A");          // adds at the end
        deque.addFirst("B");     // adds at the front
        deque.addLast("C");      // adds at the end

        System.out.println("Deque after additions: " + deque);

        // Accessing elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Removing elements
        deque.removeFirst();     // removes from front
        deque.removeLast();      // removes from end

        System.out.println("Deque after removals: " + deque);

        // Iterating through Deque
        for (String item : deque) {
            System.out.println("Item: " + item);
        }
    }
}
