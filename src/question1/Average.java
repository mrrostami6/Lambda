package question1;

import java.util.function.BiFunction;

public class Average{
    public static Double getAverage(Double number1, Double number2){
        BiFunction<Double, Double, Double> getAverage = (num1, num2) -> (num1 + num2) / 2;
        return getAverage.apply(number1 , number2);
    }
}
