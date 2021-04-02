package shreya;

import java.util.LinkedList;
import java.util.List;

public class AlphanumericPalindrome {

    public static void main(String[] args) {

        String s = "race a car";

        System.out.println(new AlphanumericPalindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {

        int n = s.length();

        int i = 0;
        int j = n-1;


        while(i<j){

            while(i<n && !((s.charAt(i)>=48 && s.charAt(i)<=57) || (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)))
            {
                i++;
            }

            while(j>=0 && !((s.charAt(j)>=48 && s.charAt(j)<=57) || (s.charAt(j)>=65 && s.charAt(j)<=90) || (s.charAt(j)>=97 && s.charAt(j)<=122))){
                j--;
            }

            if(i<j){

                if( Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;


    }
}
