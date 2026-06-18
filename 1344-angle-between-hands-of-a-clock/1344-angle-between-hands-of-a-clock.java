class Solution {
    public double angleClock(int h, int m) {
        double ha=(h%12)*30+m*0.5;
        double ma=m*6;
        double d=Math.abs(ha-ma);
        return Math.min(d,360-d);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna