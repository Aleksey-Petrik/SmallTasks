package practicejava.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {
    public static void main(String[] args) {
        Consumer<String> consumerPrint = System.out::println;

        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Mary");
        list.add("Bob");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.forEachRemaining(consumerPrint);
    }

}
