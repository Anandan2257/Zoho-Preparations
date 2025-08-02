/*
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list */
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // a. Append element at the end
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        System.out.println("a. After appending elements: " + list);

        // b. Iterate through all elements
        System.out.println("b. Iterating through all elements:");
        for (String color : list) {
            System.out.println(color);
        }

        // c. Iterate from a specified position (e.g., index 1)
        System.out.println("c. Iterating from index 1:");
        ListIterator<String> itrFromIndex = list.listIterator(1);
        while (itrFromIndex.hasNext()) {
            System.out.println(itrFromIndex.next());
        }

        // d. Iterate in reverse order
        System.out.println("d. Iterating in reverse:");
        Iterator<String> descItr = list.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // e. Insert element at a specific position (index 1)
        list.add(1, "Yellow");
        System.out.println("e. After inserting at index 1: " + list);

        // f. Insert elements at first and last positions
        list.addFirst("Orange");
        list.addLast("Purple");
        System.out.println("f. After adding at first and last: " + list);

        // g. Insert at the front of the list
        list.addFirst("White");
        System.out.println("g. After inserting at front: " + list);

        // h. Insert at the end of the list
        list.addLast("Black");
        System.out.println("h. After inserting at end: " + list);

        // i. Insert some elements at a specific position
        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("Pink");
        newColors.add("Gray");
        list.addAll(3, newColors);  // insert at index 3
        System.out.println("i. After inserting new list at index 3: " + list);

        // j. Get first and last occurrence of a specified element
        list.add("Red");  // Duplicate to show multiple occurrences
        int firstIndex = list.indexOf("Red");
        int lastIndex = list.lastIndexOf("Red");
        System.out.println("j. First occurrence of 'Red': " + firstIndex);
        System.out.println("   Last occurrence of 'Red': " + lastIndex);
    }
}

