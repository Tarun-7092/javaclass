class ques91{
    public static void main(String args[]){
        String n = "8969";
        int sum = 0;
        for(int i = 0; i < n.length(); i += 2){
            int digit = Character.getNumericValue(n.charAt(i));
            sum += digit;
        }
        System.out.print(sum);
    }
}