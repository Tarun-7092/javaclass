class ques88{
    public static void main(String args[]){
        int n = 87, count = 0;
        for(int i = 1; i*i < n; i++){
            count++;
        }
        System.out.print(count);
    }
}