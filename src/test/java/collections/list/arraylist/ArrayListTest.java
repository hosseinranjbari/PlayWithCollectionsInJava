package collections.list.arraylist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
    @Test
    void should_be_empty_when_an_array_list_just_created() {
        List<Integer> myArrayList = new ArrayList<>();

        Assertions.assertThat(myArrayList).isEmpty();

    }

    @Test
    void should_lowercase_a_String_array_list() {
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

    @Test
    void should_simple_reverse_a_String_array_list() {
        List<String> animalList = new ArrayList<>();
        animalList.add("ant");
        animalList.add("lion");
        animalList.add("Zebra");

        Collections.reverse(animalList);

        List<String> reversedAnimalList = new ArrayList<>();
        reversedAnimalList.add("Zebra");
        reversedAnimalList.add("lion");
        reversedAnimalList.add("ant");


        Assertions.assertThat(animalList).isEqualTo(reversedAnimalList);
    }

    @Test
    void should_reverse_alphabetic_a_string_array_list() {
        List<String> animalList = new ArrayList<>();
        animalList.add("ant");
        animalList.add("wolf");
        animalList.add("lion");
        animalList.add("zebra");

//        Java under 8
//        Collections.sort(animalList, Comparator.reverseOrder());

        animalList.sort(Comparator.reverseOrder());

        List<String> reversedAnimalList = new ArrayList<>();
        reversedAnimalList.add("zebra");
        reversedAnimalList.add("wolf");
        reversedAnimalList.add("lion");
        reversedAnimalList.add("ant");

        Assertions.assertThat(animalList).isEqualTo(reversedAnimalList);


    }
}
