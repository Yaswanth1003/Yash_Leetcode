class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        if(len==1){
            return mat[0][0];
        }
        else if(len==0){
            return 0;
        }
        else{
            for(int i=0;i<len;i++){
                sum = sum + mat[i][len-i-1] + mat[i][i];
            }
        }
        if((len%2)!=0){
            sum = sum - mat[len/2][len/2];
        }
        return sum;
    }
}