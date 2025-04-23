class ques65{
    public static void main(String are[]){
        int count =1;
        int n = 5;
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                    System.out.print(count + " ");
                    count++;
            }
            System.out.println();
        }
    }
}