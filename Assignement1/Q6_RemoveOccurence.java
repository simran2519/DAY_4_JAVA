//6.Remove character
//        Problem statement
//        For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
//
//        The input string will remain unchanged if the given character(X) doesn't exist in the input string.
//
//        Sample Input 1:
//        aabccbaa
//        a
//        Sample Output 1:
//        bccb
package DAY_4.Assignement1;

import java.util.Scanner;

public class Q6_RemoveOccurence
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        System.out.println("Enter the characters whose occurence you want to remove");
        String x1=sc.next();
        char x=x1.charAt(0);
        int count=0;
        String g="";
        int i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==x && count==0 )
            {
                count++;
            }
            else if(str.charAt(i)==x && count>0)
            {
                continue;
            }
            else
            {
                g=g+str.charAt(i);
            }

        }
        if(count==0)
        {
            System.out.println("The given character doesn't exists");
        }
        else
        {
            System.out.println(g);
        }
    }
}
