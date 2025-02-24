class ques41{
    public static void main(String args[]){
        int arr[] = {3,5,8,4,2,6,7,9,2};
        int even = 0;
        for(int i = 0; i < arr.length; i++){
            if(i%2 != 0){
                even += arr[i];
            }
        }
        System.out.println(even);
    }
}