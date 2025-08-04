public class HarvestFruits {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        if (n == 0) return 0;

        // Construct prefix sums
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + fruits[i][1];
        }

        // Binary search to find the left and right indices for a given position
        @SuppressWarnings("unused")
        int leftIdx = findLeft(fruits, startPos - k);
        @SuppressWarnings("unused")
        int rightIdx = findRight(fruits, startPos + k);

        int maxFruits = 0;

        // Case 1: Left only
        int leftOnlyLeft = findLeft(fruits, startPos - k);
        int leftOnlyRight = findRight(fruits, startPos);
        if (leftOnlyLeft <= leftOnlyRight) {
            maxFruits = Math.max(maxFruits, prefixSum[leftOnlyRight + 1] - prefixSum[leftOnlyLeft]);
        }

        // Case 2: Right only
        int rightOnlyLeft = findLeft(fruits, startPos);
        int rightOnlyRight = findRight(fruits, startPos + k);
        if (rightOnlyLeft <= rightOnlyRight) {
            maxFruits = Math.max(maxFruits, prefixSum[rightOnlyRight + 1] - prefixSum[rightOnlyLeft]);
        }

        // Case 3: Left then Right
        for (int x = 0; x <= k; x++) {
            int left = startPos - x;
            int right = startPos + (k - 2 * x);
            if (right < left) continue; // Invalid range
            int l = findLeft(fruits, left);
            int r = findRight(fruits, right);
            if (l <= r) {
                maxFruits = Math.max(maxFruits, prefixSum[r + 1] - prefixSum[l]);
            }
        }

        // Case 4: Right then Left
        for (int x = 0; x <= k; x++) {
            int right = startPos + x;
            int left = startPos - (k - 2 * x);
            if (left > right) continue; // Invalid range
            int l = findLeft(fruits, left);
            int r = findRight(fruits, right);
            if (l <= r) {
                maxFruits = Math.max(maxFruits, prefixSum[r + 1] - prefixSum[l]);
            }
        }

        return maxFruits;
    }

    // Helper method to find the first index where position >= target
    private int findLeft(int[][] fruits, int target) {
        int left = 0, right = fruits.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (fruits[mid][0] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Helper method to find the last index where position <= target
    private int findRight(int[][] fruits, int target) {
        int left = 0, right = fruits.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (fruits[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}