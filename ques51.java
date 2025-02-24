class ques51{
    public static int factorial(int n){
        int fact = 1;
        for(int i = n; i > 1; i--){
            fact *= i;
        }
        return fact;
    }
    public static int coeff(int a,int b){
        int co = factorial(a)/(factorial(b)*factorial(a-b));
        return co;
    }
    public static void main(String args[]){
        int n = 5;
        for(int i = 0; i< n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                int x = coeff(i,k);
                System.out.print(x + " " );
            }
            System.out.println();
        }
    }
}