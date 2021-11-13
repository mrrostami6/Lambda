package question2;

import java.util.function.Predicate;

public class StringCheck {
    public static boolean startsWithEnd(String value){
        Predicate<String> checker = (str) ->
                str.startsWith(String.valueOf(str.charAt(str.length() - 1)));
        return checker.test(value);
    }
}
