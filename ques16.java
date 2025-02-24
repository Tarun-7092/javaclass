class ques16{
    public static void main(String args[]){
        int a = 24,b = 48;
        while(b != 0){
            int c = b;
            b = a%b;
            a = c;
        }
        System.out.println(a);
    }
}