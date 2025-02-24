class ques60{
    public static void main(String args[]){
        String str = "Hello";
        char s = 'l';
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == s){
                count++;
            }
        }
        System.out.println(count);
    }
}