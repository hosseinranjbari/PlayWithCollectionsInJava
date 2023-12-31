package collections.list.arraylist;

import java.util.List;

public class LowerCase {

    public static void smallLetter(List<String> animalList) {
        for (String element : animalList) {
            animalList.set(animalList.indexOf(element), element.toLowerCase());
        }
    }
}
