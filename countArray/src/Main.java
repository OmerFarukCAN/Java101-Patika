import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> frequency = new ArrayList<>();
        int counter = 0;

        for (int number : numbers) {
            for (int i : numbers) {
                if (number == i) {
                    counter++;
                }
            }
            if (!(frequency.contains(number)) && counter > 0) {
                frequency.add(number);
                System.out.println("The number " + number + " was repeated " + counter + " times");
            }
            counter = 0;
        }
    }
}