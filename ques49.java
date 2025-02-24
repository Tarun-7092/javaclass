class ques49{
    public static void main(String args[]){
        int n1 = 24, n2 = 12,n;
        if(n1 < n2){
            n = n1;
        }else{
            n = n2;
        }
        for(int i = 1; i <= n; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                System.out.println(i);
            }
        }
    }
}