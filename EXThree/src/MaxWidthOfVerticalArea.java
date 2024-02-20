public class MaxWidthOfVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        for (int i = 1; i < points.length; i++) {
            int[] key = points[i];
            int j = i - 1;

            while (j >= 0 && points[j][0] > key[0]) {
                points[j + 1] = points[j];
                j = j - 1;
            }
            points[j + 1] = key;
        }

        int max = 0;
        for (int i = 0; i < points.length - 1; i++) {
            max = Math.max(max, points[i + 1][0] - points[i][0]);
        }

        return max;
    }
}
