class ques83{
    public static void main(String args[]){
        int n = 384763294;
        int arr[] = new int [10];
        while(n > 0){
            int rem = n%10;
            arr[rem]++;
            n = n/10;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i +" "+ arr[i]);
        }
    }
}