package pl.setblack.fpdemo;


import io.vavr.collection.List;

public class MushroomPickersLambdaVavr {
    public static void main(String[] args) {
        //take mushrooms from the baskets,
        // but not more than 20 from each
        final List<Integer> mushrooms = List.of(14, 52, 31, 62, 71, 22, 3);

        int avg = calcAverage(mushrooms);
        final int sum = mushrooms
                .map(m -> Math.min(m, 20))
                .fold(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    private static int calcAverage(List<Integer> mushrooms) {

        return 0;
    }
}
