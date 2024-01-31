//2.String Palindrome
//        Problem statement
//        Given a string, determine if it is a palindrome, considering only alphanumeric characters.
//
//        Palindrome
//        A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
//        Example:
//        If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.
//
//        The expected output for this example will print, 'true'.
//        From that being said, you are required to return a boolean value from the function that has been asked to implement.

        package DAY_4.Assignement1;

import java.util.Scanner;

public class Q2_Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        String g="";
        boolean ans=false;
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            g=g+ch;
        }
        if(str.equals(g))
        {
            ans=true;
        }
        System.out.println(ans);
    }
}
