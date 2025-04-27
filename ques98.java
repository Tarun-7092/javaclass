class ques98{
    public static void main(String are[]){
        int count =1;
        int n = 5;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(j <= i){
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}