class ques58{
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int l = arr.length;
        for(int k = 0; k <= l-1; k++){
            int i = k;
            int j = 0;
            while(i >= 0){
                System.out.print(arr[i][j]);
                j++;
                i--;
            }
            System.out.println();
        }
         for(int k = 1; k <= l-1; k++){
            int i = l-1;
            int j = k;
            while(j <= l-1){
                System.out.print(arr[i][j]);
                j++;
                i--;
            }
            System.out.println();
        }
    }
}
