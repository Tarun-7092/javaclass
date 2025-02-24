class ques44{
    public static void main(String args[]){
        String str = "The quick brown fox jumps over the lazy dog";
        String max1 = "";
        String max = ""; 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                max1 += str.charAt(i);
            }else{
                if(max.length() < max1.length()){
                    max = max1;
                }
                max1 = "";
            }
        }
        if(max.length() < max1.length()){
            max = max1;
        }
        System.out.print(max);
    }
}