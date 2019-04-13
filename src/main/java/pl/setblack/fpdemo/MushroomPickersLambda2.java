package pl.setblack.fpdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MushroomPickersLambda2 {
    public static void main(String[] args) {
        //take mushrooms from the baskests,
        // but not more than 20 from each
        final List<Integer> mushrooms = new ArrayList<>(
                Arrays.asList(14, 52, 31, 62, 71, 22, 34));
        final int sum = mushrooms.stream()
                .map(m -> Math.min(m, 20))
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);
    }
}
