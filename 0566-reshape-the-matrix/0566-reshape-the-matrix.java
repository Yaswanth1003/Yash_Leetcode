class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] new_arr = new int[r][c];
        int n = 0;
        int m = 0;
        if((row*col)!=(r*c)){
            return mat;
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    new_arr[n][m] = mat[i][j];
                    m++;
                    if(m==c){
                        m=0;
                        n++;
                }
                }
            }
        }
        return new_arr;
    }
}