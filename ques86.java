class ques86{
    public static void main(String args[]){
        int arr[] = {-3,5,-8,4,2,-6,7,9,-2};
        int pos = 0,neg = 0;
        for(int i : arr){
            if(i >= 0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}