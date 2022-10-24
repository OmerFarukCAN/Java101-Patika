import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int divide = 0;

        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);

        for (int i = 3; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divide++;
                }
            }
            if (divide == 0) {
                primeNumbers.add(i);
            }
            divide = 0;
        }
        for (int primeNumber : primeNumbers) {
            System.out.print(primeNumber + " ");
        }
    }
}