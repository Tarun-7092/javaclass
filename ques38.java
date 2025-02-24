class ques38{
    public static void main(String args []){
        int arr[] = {3,6,9,5,2,7,8,1,4};
        int max = arr[0];
        int min = arr[0];
        for(int num : arr){
            if( max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}