class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0, j = 0, n = a.length, m = b.length;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (l.size() == 0 || l.get(l.size() - 1) != a[i])
                    l.add(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                if (l.size() == 0 || l.get(l.size() - 1) != b[j])
                    l.add(b[j]);
                j++;
            } else {
                if (l.size() == 0 || l.get(l.size() - 1) != a[i])
                    l.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (l.size() == 0 || l.get(l.size() - 1) != a[i])
                l.add(a[i]);
            i++;
        }

        while (j < m) {
            if (l.size() == 0 || l.get(l.size() - 1) != b[j])
                l.add(b[j]);
            j++;
        }

        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna