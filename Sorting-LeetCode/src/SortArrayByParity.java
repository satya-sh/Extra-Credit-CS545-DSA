public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] sortedArray = new int[nums.length]; // Result array with sorted elements by parity

        int evenPointer = 0; // Pointer to place even numbers at the start of the array
        int oddPointer = nums.length - 1; // Pointer to place odd numbers at the end of the array

        for (int number : nums) {
            if (number % 2 == 0) {
                // Place even number at the current even pointer and move the pointer forward
                sortedArray[evenPointer] = number;
                evenPointer++;
            } else {
                // Place odd number at the current odd pointer and move the pointer backward
                sortedArray[oddPointer] = number;
                oddPointer--;
            }
        }

        return sortedArray;
    }
}
