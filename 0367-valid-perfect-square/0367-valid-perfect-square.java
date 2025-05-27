class Solution {
    public boolean isPerfectSquare(int num) {
        int range = 4;
        boolean sq = false;
        if(num<2) return true;
        for(int i=2;i<range || range==num;i++){
            range = i*i;
            if(range>num){
                sq = false;
                break;
            }
            else{
                if(range==num){
                    sq = true;
                    break;
                }
            }
        }
        return sq;
    }
}