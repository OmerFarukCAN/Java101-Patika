public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double avg;
        double sum = 0;

        for (double i = 1; i <= numbers.length; i++) {
            sum += (1 / i);
        }
        avg = numbers.length / sum;
        System.out.println("Harmonic average: " + avg);
    }
}