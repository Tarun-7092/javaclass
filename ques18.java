class ques18{
    public static void main(String args[]){
        int n = 48;
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(i);
            }
            if(i != (n/i)){
                System.out.println(n/i);
            }
        }
    }
}