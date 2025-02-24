class ques33{
    public static void main(String args[]){
        int n = 532;
        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem%2 != 0){
                count++;
            }
            n = n/10;
        }
        System.out.print(count);
    }
}