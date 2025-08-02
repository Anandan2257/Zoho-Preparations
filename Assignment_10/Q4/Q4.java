/*a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set */
import java.util.*;

public class Q4{
    public static void main(String[] args) {
        // a. Create a new tree set, add some colors and print it
        TreeSet<String> colorSet = new TreeSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        System.out.println("TreeSet (Colors): " + colorSet);

        // b. Iterate through all elements
        System.out.println("Iterating:");
        for (String color : colorSet) {
            System.out.println(color);
        }

        // c. Add all elements of one TreeSet to another
        TreeSet<String> anotherSet = new TreeSet<>();
        anotherSet.add("Black");
        anotherSet.addAll(colorSet);
        System.out.println("Another TreeSet after adding: " + anotherSet);

        // d. Create a reverse order view
        NavigableSet<String> reverseSet = colorSet.descendingSet();
        System.out.println("Reverse Order View: " + reverseSet);

        // e. Get first and last elements
        System.out.println("First: " + colorSet.first());
        System.out.println("Last: " + colorSet.last());

        // f. Clone TreeSet
        TreeSet<String> clonedSet = (TreeSet<String>) colorSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);

        // g. Number of elements
        System.out.println("Size: " + colorSet.size());

        // h. Compare two sets
        TreeSet<String> compareSet = new TreeSet<>(Arrays.asList("Red", "Green", "White"));
        for (String element : colorSet) {
            System.out.println("Contains " + element + "? " + compareSet.contains(element));
        }

        // TreeSet with numbers for i–o
        TreeSet<Integer> numSet = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13));

        // i. Numbers less than 7
        System.out.println("Less than 7: " + numSet.headSet(7));

        // j. Greater than or equal to a given number
        System.out.println("Ceiling of 6: " + numSet.ceiling(6));

        // k. Less than or equal to a given number
        System.out.println("Floor of 6: " + numSet.floor(6));

        // l. Strictly greater than a given number
        System.out.println("Higher than 6: " + numSet.higher(6));

        // m. Strictly less than a given number
        System.out.println("Lower than 6: " + numSet.lower(6));

        // n. Retrieve and remove the first element
        System.out.println("Poll First: " + numSet.pollFirst());
        System.out.println("After pollFirst: " + numSet);

        // o. Retrieve and remove the last element
        System.out.println("Poll Last: " + numSet.pollLast());
        System.out.println("After pollLast: " + numSet);

        // p. Remove a given element
        boolean removed = colorSet.remove("Blue");
        System.out.println("Removed 'Blue'? " + removed);
        System.out.println("After removal: " + colorSet);
    }
}
