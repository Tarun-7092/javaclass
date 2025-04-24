class ques74{
    public static void main(String args[]){
        int n = 0,a = 0, b = 1, c = 0;
        while(n < 5){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
            n++;
        }
    }
}