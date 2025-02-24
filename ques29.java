class ques29{
    public static void main(String args[]){
        int arr[] = {4,2,6,8,3,9,7,5};
        int count = 0,sum = 0;
        for(int num : arr){
            sum += num;
            count++;
        }
        float avg = sum/count;
        System.out.print(avg);
    }
}