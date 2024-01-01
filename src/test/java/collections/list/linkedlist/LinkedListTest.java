package collections.list.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    @Test
    void should_add_and_remove_from_a_linked_list() {
        List<Integer> tempLinkedList = new LinkedList<>();
        tempLinkedList.add(2);
        tempLinkedList.add(3);
        tempLinkedList.add(5);
        tempLinkedList.add(7);

        tempLinkedList.remove(tempLinkedList.size()-1);

        Assertions.assertThat(tempLinkedList.size()).isEqualTo(3);
    }
}
