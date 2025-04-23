class ques68{
    public static void main(String args[]){
        int arr[] = {3,5,8,4,2,6,7,9,2};
        int min = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        System.out.println(min);
    }
}