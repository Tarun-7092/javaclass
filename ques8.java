class ques8{
    public static void main(String args[]){
        int sum = 0,n = 987;
        while(n != 0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}