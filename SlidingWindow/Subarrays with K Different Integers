import java.util.HashMap;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        int c = 0;

        for (int r = 0; r < nums.length; r++) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);

            while (hm.size() > k) {
                hm.put(nums[l], hm.get(nums[l]) - 1);
                if (hm.get(nums[l]) == 0) {
                    hm.remove(nums[l]);
                }
                l++;
            }

            c += (r - l + 1);
        }

        return c;
    }
}
