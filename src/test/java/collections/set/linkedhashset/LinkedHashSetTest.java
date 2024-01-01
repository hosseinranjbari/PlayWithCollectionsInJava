package collections.set.linkedhashset;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedHashSetTest {
    @Test
    void should_be_in_the_same_entrance_order() {
        Set<String> animalLinkedHashSet = new LinkedHashSet<>();
        animalLinkedHashSet.add("mouse");
        animalLinkedHashSet.add("elephant");
        animalLinkedHashSet.add("dog");

        for (String animal : animalLinkedHashSet) {
            System.out.println(animal);
        }
    }
}
