import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 12, 13, 14, 14};
        List<Integer> repetitiveEvens = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j])) {
                    if (numbers[j] % 2 == 0) {
                        if (!(repetitiveEvens.contains(numbers[j]))) {
                            repetitiveEvens.add(numbers[j]);
                        }

                    }
                }
            }
        }
        System.out.print("Repetitive evens: ");
        for (int repetitiveEven : repetitiveEvens) {
            System.out.print(repetitiveEven + " ");
        }
    }
}