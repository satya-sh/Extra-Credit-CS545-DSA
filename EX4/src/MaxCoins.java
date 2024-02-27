public class MaxCoins {
    public int maxCoins(int[] piles) {
        bubbleSort(piles);
        int ans = 0;
        int n = piles.length;

        for (int i = n / 3; i < n; i += 2) {
            ans += piles[i];
        }

        return ans;
    }

    private void bubbleSort(int[] arr) {
        for (int pos = 0; pos < arr.length - 1; pos++) {
            for (int j = arr.length - 1; j > pos; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(j, j-1, arr);
                }
            }
        }
    }

    private void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
}
