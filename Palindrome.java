//  Author:   Makhmud Islamov
 //  Date  :   10/3/17
 //  Homework assignment : 3
 //  Objective : This program is Palindrome check program
 //****************************************************************
 import java.util.*;
 //************************class Palindrome************************* 
 public class Palindrome
 {
 private static final String String = null;
 char c;
  //************************main()*************************
  public static void main(String args[])
  {
         InputAndReverse();//calling InputAndReverse()
  }
 //************************InputAndReverse() ************************* 
 public static void InputAndReverse() 
 {
     String input;
     Scanner in = new Scanner(System.in);
     System.out.println("Type your phrase to check for palindrome. Type STOP to stop the program");
     input = in.nextLine(); // getting input from user
     if(input.equals("STOP"))
 {
         System.exit(0); // stopping program if user types STOP
 }else do 
 {
     int i, begin, end, middle;
     String inputString = Filter(input); // calling Filter method
     int length  = inputString.length(); // comparing characters: beginning and end
     begin  = 0;
     end    = length - 1;
     middle = (begin + end)/2;
     for (i = begin; i <= middle; i++) 
 {
     if (inputString.charAt(begin) == inputString.charAt(end)) 
 {
     begin++;
     end--;
 }
     else 
 {
     break;
 }
 }
     if (i == middle + 1) 
 {
     System.out.println(input + " is a palindrome"); 
 }
     else 
 {
     System.out.println(input + " is not a palindrome");
 } 
     System.out.println("Type your phrase to check for palindrome. Type STOP to stop the program");
     input = in.nextLine();
 }
     while(!input.equals("STOP")); // re-running program until user types STOP
 }
 //************************isUpperCase()************************* 
 public static boolean isUpperCase(char c)
 {
     return (c>='A' && c<='Z');
 }
 //************************isLowerCase()*************************
 public static boolean isLowerCase(char c)
 {
     return(c>='a' && c<='z');
 }
 //************************isDigit()*************************
 public static boolean isDigit(char c)
 {
     return(c>='0' && c<='9');
 }
 //************************isLetter()*************************
 public static boolean isLetter(char c)
 {
     return(isLowerCase(c) || isUpperCase(c)); // example of object oriented programming
 }
 //************************isLetterOrDigit()*************************
 public static boolean isLetterOrDigit(char c)
 {
     return(isLetter(c) || isDigit(c)); // example of object oriented programming
 }
 //************************isWhiteSpace()*************************
 public static boolean isWhiteSpace(char c)
 {
     return(c==' ' || c=='\\' || c=='\r' || c=='\t');
 }
 //************************Filter()*************************
 public static String Filter (String str)//filter out unnecessary characters
 {
     String t ="";
     for (int i=0; i<str.length(); i++)
 {
     char c = str.charAt(i);
     if(isLowerCase(c) || isDigit(c)) 
 {
     t+=c;
 } 
     else 
 {
     if(isUpperCase(c)) 
 {
     String cc = "";
     cc+=c;
     t+=cc.toLowerCase();
 }
 }
 }
     return t;
 }

 }
 