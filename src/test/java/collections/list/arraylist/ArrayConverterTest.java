package collections.list.arraylist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayConverterTest {
    @Test
    void should_convert_an_integer_array_to_an_Integer_array_list() {
        int[] tempArray = {2, 4, 6};

        List<Integer> tempList = ArrayConverter.toArrayList(tempArray);
        List<Integer> tempIntegerList = new ArrayList<>();
        tempIntegerList.add(2);
        tempIntegerList.add(4);
        tempIntegerList.add(6);

        Assertions.assertThat(tempList).isEqualTo(tempIntegerList);
    }
}
