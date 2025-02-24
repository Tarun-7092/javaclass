class ques28{
    public static void main(String args[]){
        int arr[] = {4,5,7,2,8,3};
        int max = arr[0];
        int max2 = arr[0];
        for(int num : arr){
            if(max < num){
                max2 = max;
                max = num;
            }
            else if((max2 < num) && (max != num)){
                max2 = num;
            }
        }
        System.out.print(max2);
    }
}