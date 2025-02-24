class ques1{
    public static void main(String args[]){
        int count=0,num=2,i;
        while(count < 20){
            for( i=2; i <= num; i++){
                if(num % i == 0){
                    break;
                }
            }
            if(i == num){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}