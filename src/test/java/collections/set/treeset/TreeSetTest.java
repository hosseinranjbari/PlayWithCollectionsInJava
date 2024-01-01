package collections.set.treeset;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    void should_sorted_insertion_data() {
        Set<String> animalTreeSet = new TreeSet<>();
        animalTreeSet.add("mouse");
        animalTreeSet.add("elephant");
        animalTreeSet.add("wolf");
        animalTreeSet.add("zebra");
        animalTreeSet.add("horse");

        for (String animal : animalTreeSet) {
            System.out.println(animal);
        }
    }
}
