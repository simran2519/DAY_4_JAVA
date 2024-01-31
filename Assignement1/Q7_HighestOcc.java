//7.Highest Occuring Charactor
//        Problem statement
//        For a given a string(str), find and return the highest occurring character.
//
//        Example:
//        Input String: "abcdeapapqarr"
//        Expected Output: 'a'
//        Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
//        If there are two characters in the input string with the same frequency, return the character which comes first.
//
//        Consider:
//        Assume all the characters in the given string to be in lowercase always.
//
//        Sample Input 1:
//        abdefgbabfba
//        Sample Output 1:
//        b

        package DAY_4.Assignement1;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_HighestOcc
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        str=String.valueOf(arr);
        int count=1;
        int max=0;
        char maxi=' ';
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            if(ch==ch1)
            {
                count++;
            }
            if(ch!=ch1)
            {
                if(max<count)
                {
                    max=count;
                    maxi=ch;
                }
                count=1;
            }
        }

//        System.out.println(max);
        System.out.println(maxi);
    }
}
