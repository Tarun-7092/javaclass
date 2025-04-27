class ques99{
    public static void main(String args[]){
        String str = "banana";
        int arr[] = new int[256];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[ch]++;
        }
        for(int i = 0; i < 256; i++){
            if(arr[i] > 0){
                System.out.println((char)i +": "+ arr[i]);
            }
        }
    }
}