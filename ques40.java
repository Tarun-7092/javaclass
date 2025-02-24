class ques40{
    public static void main(String args[]){
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                for(int k = i;k < j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}