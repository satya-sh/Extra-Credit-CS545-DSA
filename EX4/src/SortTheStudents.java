public class SortTheStudents {
    public int[][] sortTheStudents(int[][] score, int k) {
        for (int pos = 0; pos < score.length - 1; pos++) {
            for (int j = score.length - 1; j > pos; j--) {
                if (score[j][k] > score[j - 1][k]) {
                    swap(j, j - 1, score);
                }
            }
        }
        return score;
    }

    private void swap(int ind1, int ind2, int[][] arr) {
        int[] temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
