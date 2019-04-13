package pl.setblack.fpdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MushroomPickersLambda {
    public static void main(String[] args) {
        //take mushrooms from the baskets,
        // but not more than 20 from each
        final List<Integer> mushrooms = new ArrayList<>(
                Arrays.asList(14, 52, 31, 62, 71, 22, 34));
        final int sum = mushrooms.stream()
                .map(m -> Math.min(m, 20))
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
