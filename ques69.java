class ques69{
    public static void main(String args[]){
        int arr[] = {3,5,8,4,2,6,7,9,2};
        int max = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        System.out.println(max);
    }
}