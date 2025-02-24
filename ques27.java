class ques27{
    public static void main(String args[]){
        int arr[] = {3,5,8,4,2,6,7,9,2};
        int even = 0,odd = 0;
        for(int i : arr){
            if(i%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}