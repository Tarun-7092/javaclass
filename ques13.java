class ques13{
    public static void main(String args[]){
        int i,j,n = 45;
        for( i =2; i <= n; i++){
            for( j = 2; j<= i; j++){
                if(i%j == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println(i);
            }
        }
    }
}