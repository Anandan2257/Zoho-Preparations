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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("White");
        arr.add("Red");
        arr.add("Black");
        arr.add("Blue");

        System.out.println(arr.toString());
    }
}
