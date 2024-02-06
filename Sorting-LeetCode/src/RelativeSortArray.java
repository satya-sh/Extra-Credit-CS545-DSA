import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int currentIndexInArr1 = 0; // Pointer for placing elements in arr1.
        int currentIndexInArr2 = 0; // Pointer for traversing arr2.
        int lengthOfArr2 = arr2.length;

        while (currentIndexInArr2 < lengthOfArr2) {
            currentIndexInArr1 = placeAndSwap(arr1, arr2[currentIndexInArr2++], currentIndexInArr1);
        }

        // Sort the remaining elements in arr1 that were not in arr2.
        Arrays.sort(arr1, currentIndexInArr1, arr1.length);
        return arr1;
    }

    private int placeAndSwap(int[] arr, int targetElement, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == targetElement) {
                int temp = arr[startIndex];
                arr[startIndex++] = arr[i];
                arr[i] = temp;
            }
        }
        return startIndex;
    }
}
