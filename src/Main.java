import question1.Average;
import question2.StringCheck;
import question4.Grouping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // question1 use
        System.out.println("Average : "+Average.getAverage(5.0, 20.0));
        // question2 use
        System.out.println(StringCheck.startsWithEnd("ArashA"));
        // question3 use
        var result1 = Grouping.getGroupingByNumber(List.of("AA", "AB", "BBB", "BB", "ACC"));
        System.out.println(result1);
        var result2 = Grouping.getGrouping(List.of("AA", "AB", "BBB", "BB", "ACC"));
        System.out.println(result2);
    }
}
