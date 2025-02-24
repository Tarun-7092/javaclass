class ques10{
    public static void main(String args[]){
        int n = 525;
        int n1 = n,rev = 0;
        while(n != 0){
            int rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        if(n1 == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}