class ques85{
    public static void main(String args[]){
        int n = 5;
        int count = 1;
        int[][] arr = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1; 
        while(count <= n*n){
            for(int i = left; i<= right;i++){
                arr[top][i] = count++;
            }
            top++;
            for(int i = top; i<= bottom;i++){
                arr[i][right] = count++;
            }
            right--;
            for(int i = right; i>= left;i--){
                arr[bottom][i] = count++;
            }
            bottom--;
            for(int i = bottom; i>= top;i--){
                arr[i][left] = count++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        } 
    }
}