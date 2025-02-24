class ques21{
    public static void main(String args[]){
        String str ="Hello";
        int flag = 0;
        for(int i = 0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}