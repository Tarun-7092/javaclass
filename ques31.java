class ques31{
    public static void main(String args[]){
        int count = 0;
        int n = 345;
        while(n > 0){
            count++;
            n = n/10;
        }
        System.out.print(count);
    }
}