//3.All Substrings
//        Problem statement
//        For a given input string(str), write a function to print all the possible substrings.
//
//        Substring
//        A substring is a contiguous sequence of characters within a string.
//        Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
//
//        Sample Input 1:
//        abc
//        Sample Output 1:
//        a
//        ab
//        abc
//        b
//        bc
//        c
package DAY_4.Assignement1;

import java.util.Scanner;

public class Q3_substrings
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        String g="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                g=g+str.charAt(j);
                System.out.println(g);
            }
            g="";
        }
    }
}
