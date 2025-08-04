import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        // 1. Associate specified value with specified key
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(1, "Red");
        treeMap1.put(2, "Green");
        treeMap1.put(3, "Blue");
        treeMap1.put(4, "Yellow");
        System.out.println("1. TreeMap (treeMap1): " + treeMap1);

        // 2. Copy content to another TreeMap
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(treeMap1);
        System.out.println("\n2. Copied TreeMap (treeMap2): " + treeMap2);

        // 3. Search a key
        int searchKey = 2;
        boolean keyExists = treeMap1.containsKey(searchKey);
        System.out.println("\n3. Key " + searchKey + " exists? " + keyExists);

        // 4. Search a value
        String searchValue = "Blue";
        boolean valueExists = treeMap1.containsValue(searchValue);
        System.out.println("4. Value \"" + searchValue + "\" exists? " + valueExists);

        // 5. Get all keys
        Set<Integer> keys = treeMap1.keySet();
        System.out.println("\n5. All keys in TreeMap: " + keys);

        // 6. Delete all elements
        treeMap2.clear();
        System.out.println("\n6. treeMap2 after clearing: " + treeMap2);

        // 7. Sort keys using Comparator (descending order)
        TreeMap<Integer, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(treeMap1);
        System.out.println("\n7. TreeMap sorted by descending keys: " + sortedMap);

        // 8. Get key-value mapping of greatest and least key
        Map.Entry<Integer, String> firstEntry = treeMap1.firstEntry();
        Map.Entry<Integer, String> lastEntry = treeMap1.lastEntry();
        System.out.println("\n8. Least Entry: " + firstEntry);
        System.out.println("   Greatest Entry: " + lastEntry);

        // 9. Get first and last key
        System.out.println("\n9. First Key: " + treeMap1.firstKey());
        System.out.println("   Last Key: " + treeMap1.lastKey());

        // 10. Reverse order view of keys
        NavigableSet<Integer> reverseKeys = treeMap1.descendingKeySet();
        System.out.println("\n10. Reverse order view of keys: " + reverseKeys);
    }
}

