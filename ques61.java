import java.util.*;
class ques61{
    public static void main(String args[]){
       String str1 = "listen";
       String str2 = "silent";
       if (are_anagram(str1,str2)){
        System.out.println("given strings are anagram");
       } else{
        System.out.println("given strings are not anagram");
       }
    }
    public static boolean are_anagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int [] arr = new int[26];
        for(int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++){
            arr[str1.charAt(i) - 'a']--;
        }
        for(int count : arr){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}