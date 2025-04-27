class ques93{
    public static boolean isPalindrome(String str){
         for(int i = 0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str ="madamracecarpop";
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                String s = str.substring(i,j);
                if(isPalindrome(s) && s.length() > 1){
                    System.out.println(s);
                }
            }
        }
    }
}