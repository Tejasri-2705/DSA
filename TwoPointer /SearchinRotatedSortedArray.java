class Solution {
    public int search(int[] a, int x) {
        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            if (a[m] == x) {
                return m;
            }

            // Left half is sorted
            if (a[l] <= a[m]) {
                if (a[l] <= x && x < a[m]) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            // Right half is sorted
            else {
                if (a[m] < x && x <= a[h]) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
        }

        return -1;
    }
}
