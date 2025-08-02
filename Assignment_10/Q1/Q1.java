/*1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list. */

import java.util.*;

public class Q1{
    public static void main(String[] args) {
        // a. Create a new array list, add colors and print
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("a. Colors list: " + colors);

        // b. Iterate through all elements
        System.out.println("b. Iterating elements:");
        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            String color = it.next();
            System.out.println(color);
        }

        // c. Insert element at the first position
        colors.add(0, "Orange");
        System.out.println("c. After inserting at first position: " + colors);

        // d. Retrieve element at index 2
        String elementAtIndex2 = colors.get(2);
        System.out.println("d. Element at index 2: " + elementAtIndex2);

        // e. Update element at index 3
        colors.set(3, "Pink");
        System.out.println("e. After updating index 3 with 'Pink': " + colors);

        // f. Remove the third element (index 2)
        colors.remove(2);
        System.out.println("f. After removing third element: " + colors);

        // g. Search for an element
        String searchColor = "Blue";
        boolean found = colors.contains(searchColor);
        System.out.println("g. Is '" + searchColor + "' in the list:  " + found);

        // h. Sort the ArrayList
        Collections.sort(colors);
        System.out.println("h. Sorted colors: " + colors);

        // i. Copy one ArrayList into another
        ArrayList<String> copiedList = new ArrayList<>(colors);
        System.out.println("i. Copied list: " + copiedList);

        // j. Shuffle the ArrayList
        Collections.shuffle(colors);
        System.out.println("j. Shuffled colors: " + colors);
    }
}

