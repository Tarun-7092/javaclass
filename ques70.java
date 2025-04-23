class ques70{
    public static void main(String args[]){
        int arr[] = {3,5,8,4,2,6,7,9,2};
        int n = 0;
        for(int i : arr){
            int flag = 0;
            for(int j =2; j < i; j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                n++;
            }
        }
        System.out.println(n);
    }
}