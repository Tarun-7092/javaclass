class ques25{
    public static void main(String args[]){
        int n = 153,sum = 0;
        int n1 = n;
        while(n != 0){
            int rem = n%10;
            sum += (rem*rem*rem);
            n = n/10;
        }
        if(sum == n1){
            System.out.print("Armstrong");
        }else{
            System.out.print("Not Armstrong");
        }
    }
}