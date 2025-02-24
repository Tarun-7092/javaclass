class ques54{
    public static void main(String args[]){
        String str = "6237a31";
        String s = "0123456789";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            for (int j = 0 ; j < s.length(); j++){
                if(str.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
        }
        if(count == str.length()){
            System.out.println("only digit");
        }else{
            System.out.println("Not only digit");
        }
    }
}