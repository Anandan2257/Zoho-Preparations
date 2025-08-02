/*a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set */

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // a. Append specified element to HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("a. HashSet after adding elements: " + set);

        // b. Iterate through all elements
        System.out.println("b. Iterating through HashSet:");
        for (String item : set) {
            System.out.println(item);
        }

        // c. Get number of elements
        System.out.println("c. Number of elements: " + set.size());

        // d. Empty the hash set
        set.clear();
        System.out.println("d. After clearing: " + set);

        // e. Test if HashSet is empty
        System.out.println("e. Is HashSet empty? " + set.isEmpty());

        // Re-adding elements for further operations
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");

        // f. Clone HashSet to another HashSet
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("f. Cloned HashSet: " + clonedSet);

        // g. Convert HashSet to array
        String[] array = set.toArray(new String[0]);
        System.out.println("g. HashSet to Array:");
        for (String s : array) {
            System.out.println(s);
        }

        // h. Convert HashSet to TreeSet (sorted)
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("h. HashSet to TreeSet (sorted): " + treeSet);

        // i. Convert HashSet to ArrayList
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("i. HashSet to ArrayList: " + list);

        // j. Compare two HashSets
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Mango");
        anotherSet.add("Orange");
        anotherSet.add("Grapes");

        boolean isEqual = set.equals(anotherSet);
        System.out.println("j. Are two sets equal? " + isEqual);
    }
}

