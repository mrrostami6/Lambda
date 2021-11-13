package question4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static Map<Integer, List<String>> getGroupingByNumber(List<String> values){
        return values.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static Map<Integer, Long> getGrouping(List<String> values){
        return values.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }
}
