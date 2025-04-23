class ques67{
    public static void main(String args[]){
        int i=1,sum = 0;
        int n = 10;
        while(i <= n){
            if(i%2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}