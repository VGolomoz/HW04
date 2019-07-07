package HW04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class StreamUtils {

    public static String getStringNamesByOddNumbering(List<String> names) {

        AtomicInteger index = new AtomicInteger(-1);

        return names
                .stream()
                .map(s -> index.addAndGet(2) + ". " + s)
                .collect(Collectors.joining(", "));
    }

    public static List<String> getSortedWordsListUpperCase(List<String> list) {

        return list
                .stream()
                .map(p -> p.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> getElementsListSeparateByComma(List<String> list) {

        return list
                .stream()
                .flatMap((p) -> Arrays.asList(p.split(",")).stream())
                .map((p) -> p.trim())
                .collect(Collectors.toList());
    }


    public static LongStream generatorRandoms(long seed, long a, long c, long m) {

        return LongStream.iterate(seed, n -> (a * n + c) % m);
    }

    public static <T>Stream<T> mixElementsFromTwoStreamsOnyByOne(Stream<T> streamA, Stream<T> streamB) {

        List<T> result = new ArrayList<>();
        List<T> listA = streamA.collect(Collectors.toList());
        List<T> listB = streamB.collect(Collectors.toList());

        for (int i = 0; i < listA.size() && i < listB.size(); i++) {
            result.add(listA.get(i));
            result.add(listB.get(i));
        }

        return result.stream();
    }

    public static <T>List<T> mixElementsFromTwoStreamsInOneArray(Stream<T> streamA, Stream<T> streamB) {

        List<T> result = Stream.concat(streamA, streamB).collect(Collectors.toList());

        return result;
    }
}
