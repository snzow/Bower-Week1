package Recursion;


public class Main {

    public static void main(String args[]) {
        RecursionMethods test = new RecursionMethods();
        System.out.println("isPalindrome Test:");
        System.out.print("racecar: ");
        System.out.println(test.isPalindrome("racecar"));
        System.out.print("golf: ");
        System.out.println(test.isPalindrome("golf"));
        System.out.println("factorial test:");
        System.out.print("5: ");
        System.out.println(test.factorial(5));
        System.out.print("9: ");
        System.out.println(test.factorial(9));
    }

}
