package pl.setblack.fpdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MushroomPickersLambdaMutation {
    public static void main(String[] args) {
        //take mushrooms from the baskests,
        // but not more than 20 from each
        final List<Integer> mushrooms = new ArrayList<>(
                Arrays.asList(14, 52, 31, 62, 71, 22, 34)
        );
        int avg = calcAverage(mushrooms);
        final int sum = mushrooms.stream()
                .map(m -> Math.min(m, 20))
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    private static int calcAverage(List<Integer> mushrooms) {
        int minimal = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i<mushrooms.size(); i++) {
            int basket = mushrooms.get(i);
            if (basket < minimal) {
                minimal  = basket;
                idx =  i;
            }
        }
        mushrooms.remove(idx);
        int maximal = 0;
        idx = 0;
        for (int i = 0; i<mushrooms.size(); i++) {
            int basket = mushrooms.get(i);
            if (basket > maximal) {
                maximal  = basket;
                idx = i;
            }
        }
        mushrooms.remove(idx);
        int sum = 0;
        for (int i = 0; i<mushrooms.size(); i++) {
            sum += mushrooms.get(i);
        }
        return sum/mushrooms.size();
    }
}
