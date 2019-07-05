import HW04.StreamUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StreamUtilsTest {


    @Test
    public void shouldGetStringWithNamesWithOddNumbering() {
        assertEquals("1. Ivan, 3. Arnold, 5. Robert, 7. Dakota, 9. Mike, 11. Leonid",
                StreamUtils.getStringNames(Arrays.asList("Ivan", "Arnold", "Robert", "Dakota", "Mike", "Leonid")));
    }

    @Test
    public void shouldGetSortedWordsListWithUpperCase() {
        assertEquals(Arrays.asList("HELLO", "IS", "MY", "NAME", "WORLD"),
                StreamUtils.getSortedWordsListUpperCase(Arrays.asList("hELLo", "worlD", "mY", "Name", "Is")));
    }

    @Test
    public void shouldGetElementsListSeparateByComma() {
        assertEquals(Arrays.asList("1", "2", "0", "4", "5"),
                StreamUtils.getElementsListSeparateByComma(Arrays.asList("1, 2, 0", "4, 5")));
    }


}
