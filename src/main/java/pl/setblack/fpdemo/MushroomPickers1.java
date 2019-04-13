package pl.setblack.fpdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MushroomPickers1 {
    public static void main(String[] args) {
        //take mushrooms from the baskets,
        // but not more than 20 from each

        List<Integer> mushrooms = new ArrayList<>(
                Arrays.asList(14, 52, 31, 62, 71, 22, 34));

        int sum = 0;
        int i = 0;
        while (i < 6) {
            if (mushrooms.get(i++) > 20) {
                sum = sum + 20;
            } else {
                sum = sum + mushrooms.get(i);
            }
        }
        System.out.println(sum);
    }
}
