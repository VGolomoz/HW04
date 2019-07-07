import HW04.StreamUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamUtilsTest {


    @Test
    public void shouldGetStringWithNamesWithOddNumbering() {
        assertEquals("1. Ivan, 3. Arnold, 5. Robert, 7. Dakota, 9. Mike, 11. Leonid",
                StreamUtils.getStringNamesByOddNumbering(Arrays.asList("Ivan", "Arnold", "Robert", "Dakota", "Mike", "Leonid")));
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

    @Test
    public void shouldGetRandomsNumbersAccordingToCondition() {
        LongStream result = StreamUtils.generatorRandoms(137, 6, 17, 149);
        final String expected = "[137, 94, 134, 76, 26, 24, 12, 89, 104, 45]";
        assertEquals(expected, result.limit(10).boxed().collect(Collectors.toList()).toString());
    }

    @Test
    public void shouldGetOneStreamWithMixedElementsOneByOneFromTwoStreams() {
        assertEquals(Arrays.asList("1", "2", "3", "4", "5", "6"),
                StreamUtils.mixElementsFromTwoStreamsOnyByOne(Stream.of("1", "3", "5"), Stream.of("2", "4", "6")).collect(Collectors.toList()));
    }

    @Test
    public void shouldGetOneStreamWithElementsFromTwoStreams() {
        assertEquals(Arrays.asList("1", "3", "5", "7", "9", "2", "4", "6"),
                StreamUtils.mixElementsFromTwoStreamsInOneArray(Stream.of("1", "3", "5", "7", "9"), Stream.of("2", "4", "6")));
    }


}
