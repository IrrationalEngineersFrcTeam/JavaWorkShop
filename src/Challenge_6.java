import java.util.Scanner;

/**
 * Created by epalmer on 2/25/17.
 */
public class Challenge_6 {
    public static void main(String[] args){
        //make this program work
        //(hint: .equals)
        String str,revStr="";
        System.out.println("Enter something to check if it is a palindrome");
        Scanner sn = new Scanner(System.in);
        str = sn.nextLine();
        for(int i=str.length()-1;i>=0;i++)
        {
            revStr+=Character.toString(str.charAt(i));
        }
        if(revStr==str)
        {
            System.out.println("The string "+str+" is a Palindrome");
            System.out.println(revStr);
        }
        else
        {
            System.out.println("The string "+str" is not a Palindrome");
            System.out.println(revStr);
        }
    }





}
}
