class ques50{
    public static void main(String args[]){
        int a = 0,b = 1,n = 4,sum = 0;
        for(int i=0; i<n; i++){
            int c = a+b;
            sum += c;
            a = b;
            b = c;
        }
        System.out.print(sum);
    }
}