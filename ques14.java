class ques14{
    public static void main(String args[]){
        int i,n = 57;
        for( i=2; i <= 57; i++){
            if(n%i == 0){
                break;
            }
        }
        if(i == n){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}