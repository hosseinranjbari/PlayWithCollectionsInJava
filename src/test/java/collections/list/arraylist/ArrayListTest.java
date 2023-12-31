package collections.list.arraylist;

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

    @Test
    void should_lowercase_an_String_array_list() {
        List<String> animalList = new ArrayList<>();
        animalList.add("Zebra");
        animalList.add("wOLf");
        animalList.add("LioN");

        LowerCase.smallLetter(animalList);

        List<String> animalListLowerCase = new ArrayList<>();
        animalListLowerCase.add("zebra");
        animalListLowerCase.add("wolf");
        animalListLowerCase.add("lion");

        Assertions.assertThat(animalList).isEqualTo(animalListLowerCase);


    }
}
