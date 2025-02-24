class ques37{
    public static void main(String args[]){
        int vowel = 0;
        String str = "Hello";
        String a = "AEIOUaeiou";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < a.length(); j++){
                if(str.charAt(i) == a.charAt(j)){
                    vowel++;
                }
            }    
        }
        System.out.println(vowel);
        System.out.println(str.length()-vowel);        
    }
}