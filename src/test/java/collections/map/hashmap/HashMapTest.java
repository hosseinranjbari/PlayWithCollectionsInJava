package collections.map.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    @Test
    void should_have_key_values_for_geometrics() {
        Map<String, String> geometrics = new HashMap<>();
        geometrics.put("circle", "red");
        geometrics.put("square", "red");
        geometrics.put("triangle", "blue");

        Set<Map.Entry<String, String>> geometrics_set = geometrics.entrySet();

        for (Map.Entry<String, String> element : geometrics_set) {
            System.out.print("key " + element.getKey());
            System.out.println(" value " + element.getValue());
        }

    }
}
