class ques53{
    public static void main(String args[]){
        int n = 10;
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++){
            if(i%2 != 0){
                even += i;
            }else{
                odd += i;
            }
        }
        int diff = Math.abs(even - odd);
        System.out.println(diff);
    }
}