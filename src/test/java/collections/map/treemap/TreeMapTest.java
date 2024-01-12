package collections.map.treemap;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    void should_return_sorted_map() {
        Map<String, Integer> studentMarks = new TreeMap<>();
        studentMarks.put("reza", 10);
        studentMarks.put("hamid", 15);
        studentMarks.put("semin", 17);
        studentMarks.put("amir", 12);
        studentMarks.put("yaser", 19);

        Set<Map.Entry<String, Integer>> studentMapSorted = studentMarks.entrySet();

        for (Map.Entry<String, Integer> student : studentMapSorted) {
            System.out.print("student " + student.getKey());
            System.out.println(" mark is: " + student.getValue());
        }
    }
}
