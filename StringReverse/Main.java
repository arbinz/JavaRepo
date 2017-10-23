import java.util.*; 
import java.io.*;

class Main {  
    
  public static String FirstReverse(String str) { 
  
    String revword = "";
    int wordLength = str.length();
    for (int i=0;i<wordLength;i++)
    {
        revword += str.charAt(wordLength-i-1);
    }
       
    return revword;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
