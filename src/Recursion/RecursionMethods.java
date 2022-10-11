package Recursion;

public class RecursionMethods implements RecursionMethodsInterface {

    /** returns the factorial of n
     *
     * @param n a non-negative integer
     * @return the factorial of n
     */
    public int factorial(int n){

        //base case
        if (n <= 1){
            return 1;
        }
        //multiplying n by a recursive call of n-1
        else{
            return n * factorial(n-1);
        }

    }

    /** takes an input string and determines whether it is a palindrome recursively
     *
     * @param s an input string
     * @return true if s is a palindrome, false if it is not
     */
    public boolean isPalindrome(String s){

        //setting all letters to lowercase to avoid mixups
        s = s.toLowerCase();

        //getting the length of s
        int length = s.length();
        //base case
        if (s.length() <= 1){
            return true;
        }
        //checking if the first and last characters are the same, and recursively calling the method on the remaining letters
        else if (s.charAt(0) == s.charAt(length - 1) && isPalindrome(s.substring(1,length - 1))){
            return true;
        }
        else{
            return false;
        }

    }

}
