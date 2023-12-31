package collections.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @Test
    void should_be_empty_when_an_array_list_just_created() {
        List<Integer> myArrayList = new ArrayList<>();

        Assertions.assertThat(myArrayList).isEmpty();
    }
}
