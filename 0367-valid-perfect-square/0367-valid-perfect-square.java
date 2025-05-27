class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        for (int i = 2; i <= num / i; i++) {
            int square = i * i;
            if (square == num) {
                return true;
            } else if (square > num) {
                break;
            }
        }

        return false;
    }
}