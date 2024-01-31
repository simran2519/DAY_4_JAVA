//8.Compress the String
//        Problem statement
//        Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
//        Example:
//        If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
//        The string is compressed only when the repeated character count is more than 1.
//        Note:
//        Consecutive count of every character in the input string is less than or equal to 9. You are not required to print anything. It has already been taken care of. Just implement the given function and return the compressed string.
package DAY_4.Assignement1;
import java.util.Scanner;
public class Q8_CompressString
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();

        String g="";
        int count=1;
        int i;
        for( i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            if(ch==ch1)
            {
                count++;
            }
            if(ch!=ch1)
            {
                if(count==1)
                {
                    g=g+ch;
                }
                else
                {
                    g=g+ch+count;
                    count=1;
                }

            }
        }
        if(count==1)
        {
            g=g+str.charAt(str.length()-1);
        }
        else if(count>2)
        {
            g=g+str.charAt(str.length()-1)+count;
        }
        System.out.println(g);


    }
}
