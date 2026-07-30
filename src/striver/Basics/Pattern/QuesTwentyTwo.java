package striver.Basics.Pattern;

public class QuesTwentyTwo {
    public static void main(String[] args) {
        int n = 4; // The maximum number at the center/outer edge
        int size = 2 * n - 1; // Total rows and columns (e.g., 7x7 grid)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Calculate distance to all 4 walls
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                // Find the minimum distance to any wall, then subtract from n
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }
}