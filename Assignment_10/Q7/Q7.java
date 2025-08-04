import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        // 1. Associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
        System.out.println("1. HashMap: " + map1);

        // 2. Count the number of key-value mappings
        System.out.println("\n2. Size of map1: " + map1.size());

        // 3. Copy all mappings to another map
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("\n3. map2 after copying from map1: " + map2);

        // 4. Remove all mappings from a map
        map2.clear();
        System.out.println("\n4. map2 after clearing: " + map2);

        // 5. Check if a map is empty
        System.out.println("\n5. Is map2 empty? " + map2.isEmpty());

        // 6. Get a shallow copy of a HashMap
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map1.clone();
        System.out.println("\n6. Shallow copy of map1: " + shallowCopy);

        // 7. Test if a map contains a specified key
        int keyToCheck = 2;
        System.out.println("\n7. Contains key " + keyToCheck + "? " + map1.containsKey(keyToCheck));

        // 8. Test if a map contains a specified value
        String valueToCheck = "Cherry";
        System.out.println("8. Contains value \"" + valueToCheck + "\"? " + map1.containsValue(valueToCheck));

        // 9. Create a set view of the mappings
        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();
        System.out.println("\n9. Set view of entries in map1:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 10. Get the value for a specified key
        int getKey = 3;
        String value = map1.get(getKey);
        System.out.println("\n10. Value for key " + getKey + ": " + value);
    }
}
