class ques57{
    public static void main(String args[]){
        int arr[] = {24,5325,768,4,776,-21};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            while(arr[i] != 0){
            arr[i] = arr[i]/10;
            count++;
        }
        } 
        System.out.print(count);
    }
}