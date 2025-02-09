// import java.util.*;

// public class GroupAssignment {

//     public static int[] assignGroups(int[] groups, int[] elements) {
//         int[] assigned = new int[groups.length];

//         for (int i = 0; i < groups.length; i++) {
//             int groupSize = groups[i];
//             int chosenElementIndex = -1;

//             // Iterate through elements to find the smallest index j that satisfies the condition
//             for (int j = 0; j < elements.length; j++) {
//                 if (groupSize % elements[j] == 0) {
//                     chosenElementIndex = j;
//                     break; // Assign the smallest index j
//                 }
//             }

//             assigned[i] = chosenElementIndex;
//         }

//         return assigned;
//     }

//     public static void main(String[] args) {
//         // Example 1
//         int[] groups1 = {8, 4, 3, 2, 4};
//         int[] elements1 = {4, 2};
//         int[] result1 = assignGroups(groups1, elements1);
//         System.out.println("Output 1: " + Arrays.toString(result1)); // [0, 0, -1, 1, 0]

//         // Example 2
//         int[] groups2 = {2, 3, 5, 7};
//         int[] elements2 = {5, 3, 3};
//         int[] result2 = assignGroups(groups2, elements2);
//         System.out.println("Output 2: " + Arrays.toString(result2)); // [-1, 1, 0, -1]

//         // Example 3
//         int[] groups3 = {10, 21, 30, 41};
//         int[] elements3 = {2, 1};
//         int[] result3 = assignGroups(groups3, elements3);
//         System.out.println("Output 3: " + Arrays.toString(result3)); // [0, 1, 0, 1]
//     }
// }
import java.util.*;

public class GroupAssignmentOptimized {

    public static int[] assignGroups(int[] groups, int[] elements) {
        int[] assigned = new int[groups.length];

        // Preprocess elements: map each element to its smallest index
        Map<Integer, Integer> elementToIndex = new HashMap<>();
        for (int j = 0; j < elements.length; j++) {
            if (!elementToIndex.containsKey(elements[j])) {
                elementToIndex.put(elements[j], j);
            }
        }

        // Assign elements to groups
        for (int i = 0; i < groups.length; i++) {
            int groupSize = groups[i];
            int chosenElementIndex = -1;

            // Find all divisors of groupSize
            for (int divisor = 1; divisor * divisor <= groupSize; divisor++) {
                if (groupSize % divisor == 0) {
                    // Check if the divisor exists in the elements array
                    if (elementToIndex.containsKey(divisor)) {
                        int currentIndex = elementToIndex.get(divisor);
                        if (chosenElementIndex == -1 || currentIndex < chosenElementIndex) {
                            chosenElementIndex = currentIndex;
                        }
                    }
                    // Check if the complementary divisor exists in the elements array
                    int complementaryDivisor = groupSize / divisor;
                    if (complementaryDivisor != divisor && elementToIndex.containsKey(complementaryDivisor)) {
                        int currentIndex = elementToIndex.get(complementaryDivisor);
                        if (chosenElementIndex == -1 || currentIndex < chosenElementIndex) {
                            chosenElementIndex = currentIndex;
                        }
                    }
                }
            }

            assigned[i] = chosenElementIndex;
        }

        return assigned;
    }

    public static void main(String[] args) {
        // Example 1
        int[] groups1 = {8, 4, 3, 2, 4};
        int[] elements1 = {4, 2};
        int[] result1 = assignGroups(groups1, elements1);
        System.out.println("Output 1: " + Arrays.toString(result1)); // [0, 0, -1, 1, 0]

        // Example 2
        int[] groups2 = {2, 3, 5, 7};
        int[] elements2 = {5, 3, 3};
        int[] result2 = assignGroups(groups2, elements2);
        System.out.println("Output 2: " + Arrays.toString(result2)); // [-1, 1, 0, -1]

        // Example 3
        int[] groups3 = {10, 21, 30, 41};
        int[] elements3 = {2, 1};
        int[] result3 = assignGroups(groups3, elements3);
        System.out.println("Output 3: " + Arrays.toString(result3)); // [0, 1, 0, 1]
    }
}