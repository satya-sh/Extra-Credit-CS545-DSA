public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int totalPeople = names.length;
        String[] sortedNames = new String[totalPeople];
        int[] sortedHeights = new int[totalPeople];

        // Copy heights to sortedHeights array
        int copyIndex = 0;
        for (int height : heights) {
            sortedHeights[copyIndex] = height;
            copyIndex++;
        }

        // Sort the heights in descending order (Bubble Sort)
        for (int i = 0; i < totalPeople - 1; i++) {
            for (int j = i + 1; j < totalPeople; j++) {
                if (sortedHeights[i] < sortedHeights[j]) {
                    int temp = sortedHeights[i];
                    sortedHeights[i] = sortedHeights[j];
                    sortedHeights[j] = temp;
                }
            }
        }

        // Map the sorted heights to the corresponding names
        int sortedIndex = 0;
        for (int sortedHeight : sortedHeights) {
            int originalIndex;
            for (originalIndex = 0; originalIndex < totalPeople; originalIndex++) {
                if (sortedHeight == heights[originalIndex]) {
                    break; // Found the original index of the person with this height
                }
            }
            sortedNames[sortedIndex] = names[originalIndex];
            sortedIndex++;
        }

        return sortedNames;
    }
}
