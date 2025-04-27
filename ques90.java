class ques90{
    public static void main(String args[]){
        int arr[] = {4,5,7,2,8,3};
        int min = arr[0];
        int min2 = arr[0];
        for(int num : arr){
            if(min > num){
                min2 = min;
                min = num;
            }
            else if((min2 > num) && (min != num)){
                min2 = num;
            }
        }
        System.out.print(min2);
    }
}