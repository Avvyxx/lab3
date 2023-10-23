import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void filterTest1() {
        List<String> list = Arrays.asList(new String[]{"foo", "hello", "fworld"});
        List<String> filteredList = ListExamples.filter(list, new StartsWithF());
        List<String> expected = Arrays.asList(new String[]{"foo", "fworld"});
        assertEquals(expected, filteredList);
    }

    @Test
    public void mergeTest1() {
        List<String> list1 = Arrays.asList(new String[]{"a", "c"});
        List<String> list2 = Arrays.asList(new String[]{"b", "h", "z"});
        List<String> mergedLists = ListExamples.merge(list1, list2);
        List<String> expected = Arrays.asList(new String[]{"a", "b", "c", "h", "z"});
        assertEquals(expected, mergedLists);
    }
}
