class ques9{
    public static void main(String args[]){
        String str = "Hello";
        String s = "AEIOUaeoiu";
        int vowel = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j< s.length(); j++){
                if(str.charAt(i) == s.charAt(j)){
                    vowel++;
                }
            }
        }
        System.out.println(vowel);
    }
}