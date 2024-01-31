//4.check Permutation
//        Problem statement
//        For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
//
//        Permutations of each other
//        Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.
//
//        Example:
//        str1= "sinrtg"
//        str2 = "string"
//
//        The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
//        Sample Input 1:
//        abcde
//        baedc
//        Sample Output 1:
//        true
package DAY_4.Assignement1;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_Anagram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean ans = false;
//        String str1="Simran";
//        String str2="imSran";
        if (str1.length() != str2.length()) {
            ans = false;
        }
        else
        {
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            str1=String.valueOf(arr1);
            str2=String.valueOf(arr2);
            if(str1.equals(str2))
            {
                ans=true;
            }
        }
        System.out.println(ans);
    }
}
