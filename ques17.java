class ques17{
    public static void main(String args[]){
        int a = 24,b = 48;
        int a1 = a,b1 = b;
        while(b != 0){
            int c = b;
            b = a%b;
            a = c;
        }
        System.out.println((a1*b1)/a);
    }
}