//5.Remove Consecutive Duplicates
//        Problem statement
//        For a given string(str), remove all the consecutive duplicate characters.
//
//        Example:
//        Input String: "aaaa"
//        Expected Output: "a"
//
//        Input String: "aabbbcc"
//        Expected Output: "abc"
//        Input Format:
//        The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
//        Output Format:
//        The only line of output prints the updated string.
//        Note:
//        You are not required to print anything. It has already been taken care of.
package DAY_4.Assignement1;

import java.util.Scanner;

public class Q5_removeDuplicates
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        char firstch=str.charAt(0);
        String g= String.valueOf(firstch);
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i-1);
            if(ch==ch1)
            {
                continue;   //a
            }
            else if(ch!=ch1)
            {
                g=g+ch;
            }
        }
        System.out.println(g);
    }
}
