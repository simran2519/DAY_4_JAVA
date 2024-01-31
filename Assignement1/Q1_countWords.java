//1.Count Words
//        Problem statement
//        For a given input string(str), find and return the total number of words present in it.
//
//        It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
//
//        Sample Input 1:
//        This is Avisoft
//        Sample Output 1:
//        3
package DAY_4.Assignement1;
import java.util.Scanner;
public class Q1_countWords
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
       //String str=sc.next();  //is used for String which contains only one word
       int i;
       int count=1;
       for(i=0;i<str.length();i++)
       {
           if(str.isEmpty())
           {
               count=0;
               break;
           }
           else if(str.charAt(i)==' ')
           {
               count++;
           }
       }
        System.out.println("The no. of words in String are: "+ count);
    }
}
