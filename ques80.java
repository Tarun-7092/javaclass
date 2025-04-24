class ques80{
    public static void main(String args[]){
        int a[] ={2,3,4,5,6,7,8};
        int max = a[0]*a[1];
        for(int i =0; i< a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(max < a[i]*a[j]){
                    max = a[i]*a[j];
                }
            }
        }
        System.out.print(max);
    }

}