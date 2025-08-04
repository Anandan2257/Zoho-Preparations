/*. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority 
queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue */

import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        // 1. Create a new PriorityQueue and add some colors
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Blue");
        pq1.add("Yellow");
        pq1.add("White");

        System.out.println("1. Elements in PriorityQueue:");
        System.out.println(pq1); // Automatically sorted in natural order

        // 2. Iterate through all elements in the priority queue
        System.out.println("\n2. Iterating through PriorityQueue:");
        for (String color : pq1) {
            System.out.println(color);
        }

        // 3. Add all elements of pq1 to another PriorityQueue
        PriorityQueue<String> pq2 = new PriorityQueue<>(pq1);
        System.out.println("\n3. New PriorityQueue (pq2) with elements from pq1:");
        System.out.println(pq2);

        // 4. Insert a given element
        pq1.add("Black");
        System.out.println("\n4. After inserting 'Black' into pq1:");
        System.out.println(pq1);

        // 5. Remove all elements
        pq1.clear();
        System.out.println("\n5. After removing all elements from pq1:");
        System.out.println(pq1);

        // 6. Count the number of elements in pq2
        System.out.println("\n6. Number of elements in pq2:");
        System.out.println(pq2.size());

        // 7. Compare pq1 and pq2
        boolean isEqual = pq1.equals(pq2);
        System.out.println("\n7. Comparing pq1 and pq2:");
        System.out.println("Are they equal? " + isEqual);

        // 8. Retrieve the first element (head) without removing
        String peekElement = pq2.peek();
        System.out.println("\n8. First element of pq2 (peek): " + peekElement);

        // 9. Retrieve and remove the first element
        String removedElement = pq2.poll();
        System.out.println("9. First element removed (poll): " + removedElement);
        System.out.println("After removal, pq2: " + pq2);

        // 10. Convert priority queue to array
        Object[] array = pq2.toArray();
        System.out.println("\n10. PriorityQueue converted to array:");
        System.out.println(Arrays.toString(array));
    }
}

