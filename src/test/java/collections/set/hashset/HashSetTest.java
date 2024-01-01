package collections.set.hashset;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    @Test
    void should_remove_duplicate_elements() {
        Set<String> animalSet = new HashSet<>();
        animalSet.add("Horse");
        animalSet.add("Wolf");
        animalSet.add("Cow");
        animalSet.add("Horse");
        animalSet.add("Lion");
        animalSet.add("Cow");

        Set<String> expectedHashSet = new HashSet<>();
        expectedHashSet.add("Horse");
        expectedHashSet.add("Wolf");
        expectedHashSet.add("Cow");
        expectedHashSet.add("Lion");

        Assertions.assertThat(animalSet).isEqualTo(expectedHashSet);

        for (String animal : animalSet) {
            System.out.println(animal);
        }
    }
}
