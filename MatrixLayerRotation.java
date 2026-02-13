import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int layers = Math.min(m, n) / 2;

        for(int layer = 0; layer < layers; layer++) {

            List<Integer> list = new ArrayList<>();

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            for(int i = left; i <= right; i++)
                list.add(matrix[top][i]);

            for(int i = top + 1; i <= bottom - 1; i++)
                list.add(matrix[i][right]);

            for(int i = right; i >= left; i--)
                list.add(matrix[bottom][i]);

            for(int i = bottom - 1; i >= top + 1; i--)
                list.add(matrix[i][left]);

            int size = list.size();
            int rotation = r % size;

            List<Integer> rotated = new ArrayList<>();

            for(int i = rotation; i < size; i++)
                rotated.add(list.get(i));

            for(int i = 0; i < rotation; i++)
                rotated.add(list.get(i));

            int index = 0;

            for(int i = left; i <= right; i++)
                matrix[top][i] = rotated.get(index++);

            for(int i = top + 1; i <= bottom - 1; i++)
                matrix[i][right] = rotated.get(index++);

            for(int i = right; i >= left; i--)
                matrix[bottom][i] = rotated.get(index++);

            for(int i = bottom - 1; i >= top + 1; i--)
                matrix[i][left] = rotated.get(index++);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
