class ques46{
    public static void main(String args[]){
        int n = 496;
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                sum += i;
                if(i != n/i){
                    sum += (n/i);
                }
            }            
        }
        if(n == sum){
            System.out.print("Perfect number");
        }else{
            System.out.print("Not perfect");
        }
    }
}