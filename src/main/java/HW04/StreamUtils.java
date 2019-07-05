package HW04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamUtils {

    public static String getStringNames(List<String> names) {

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

    public static ArrayList<String> getElementsListSeparateByComma(List<String> list) {

        return (ArrayList<String>) list
                .stream()
                .flatMap((p) -> Arrays.asList(p.split(",")).stream())
                .collect(Collectors.toList());

    }


}
