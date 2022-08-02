package kavyanshbansal;


import java.util.Scanner;   
class PallandromNumber  
{  
   public static void main(String args[])  
   {  
      Scanner r=new Scanner(System.in);
      
      System.out.println("Enter the string: ");
      String s=r.nextLine();
      
     String reverse="";
      
      for(int i=s.length()-1;i>=0;i--) {
           reverse =reverse+ s.charAt(i);
      }
    		  if(reverse.equals(s))
    			  System.out.println("The given string is a palindrom");
    		  
    		  else
    			  System.out.println("The given string is not a palindrome");
    		  
    		  
    		  
    		  
    		  
   }}