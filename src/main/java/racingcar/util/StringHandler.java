package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StringHandler {

    public static List<String> stringToList(String input) {
        return Arrays.stream(input.split(",")).toList();
    }

    public static <T> String listToString(List<T> input) {
        return input.stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }
}
