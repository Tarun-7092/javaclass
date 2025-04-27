class ques81{
    public static void main(String args[]){
        String str ="Hello";
        String rev ="";
        for(int i = 0; i< str.length(); i++){
            rev += str.charAt(str.length() -i -1);
        }
        System.out.print(rev);
    }
}