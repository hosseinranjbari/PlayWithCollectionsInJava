package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayConverter {
    public static List<Integer> toArrayList(int[] tempArray) {
        List<Integer> tempIntegerList = new ArrayList<>();

        for (int element : tempArray) {
            tempIntegerList.add(element);
        }
        return tempIntegerList;
    }
}
