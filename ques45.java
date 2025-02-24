class ques45{
    public static void main(String args[]){
        String str = "The quick brown fox jumps over the lazy dog";
        String min1 = "";
        String min = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                min += str.charAt(i);
            }else{
                break;
            }
        }     
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                min1 += str.charAt(i);
            }else{
                if(min1.length() < min.length()){
                    min = min1;
                }
                min1 = "";
            }
        }
        if(min1.length() < min.length()){
            min = min1;
        }
        System.out.print(min);
    }
}