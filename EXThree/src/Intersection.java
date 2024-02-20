import java.util.ArrayList;

public class Intersection {
    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps;
        for (int pos = 0; pos < n - 1; pos++) {
            swaps = 0;
            // start at the end and go to pos, comparing neighboring elements
            // and swapping them as needed
            // This will bubble the smallest element to the top
            for (int j = n - 1; j > pos; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        bubbleSort(nums1);
        bubbleSort(nums2);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert the list to an array
        int[] result = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
