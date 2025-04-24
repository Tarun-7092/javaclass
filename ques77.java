class ques77{
    public static void main(String args[]){
        int n = 256, flag = 0;
        if(n < 1){
            flag = 1;
        }else{
            while(n > 1){
                if(n%2 != 0){
                    flag = 1;
                }
                n = n/2;
            }
        }
        if(flag == 1){
             System.out.print("not power of two");
            }else{
                System.out.print("power of two");
        }
    }
}