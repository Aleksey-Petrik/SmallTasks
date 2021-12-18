package practicejava.listiterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainListIterator {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alex");
        linkedList.add("Mary");
        linkedList.add("Bob");

        ListIterator<String> listIterator = linkedList.listIterator();
        listIterator.forEachRemaining(System.out::println);
    }

}