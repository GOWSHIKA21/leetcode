class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double avg = (double) sum / nums.length;
        int num = 1;
        while (num <= avg) {
            num++;
        }
        boolean found = true;
        while (found) {
            found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    found = true;
                    num++;
                    break;
                }
            }
        }
        return num;
    }
}