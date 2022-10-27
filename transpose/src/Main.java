public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},

        };
        for (int i = 0; i < arr[0].length; i++) {
            for (int[] ints : arr) {
                System.out.print(ints[i] + " ");

            }
            System.out.println();
        }
    }
}