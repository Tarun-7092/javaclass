class ques84{
    public static void main(String args[]){
        int n = 6523, sum = 0;
        while(n > 0){
            int rem = n%10;
            if(rem%3 == 0){
                sum += rem;
            }
            n = n/10;
        }
        System.out.print(sum);
    }
}