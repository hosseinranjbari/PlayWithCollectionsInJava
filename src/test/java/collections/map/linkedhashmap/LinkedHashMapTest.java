package collections.map.linkedhashmap;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {
    @Test
    void should_have_key_values_with_the_same_order() {
        Map<String, String> fruits = new LinkedHashMap<>();
        fruits.put("banana", "موز");
        fruits.put("apple", "سیب");
        fruits.put("orange", "پرتقال");
        fruits.put("lemon", "لیمو");
        fruits.put("apple", "sib");

        Set<Map.Entry<String, String>> fruitMapSet = fruits.entrySet();

        for (Map.Entry<String, String> fruit : fruitMapSet) {
            System.out.print("key is " + fruit.getKey());
            System.out.println(" value is " + fruit.getValue());
        }

    }
}
