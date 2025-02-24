class ques7{
    public static void main(String args[]){
        int a = 0,b = 1,n = 9;
        for(int i=0; i<n; i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}