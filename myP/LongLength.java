import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    // code goes here  
    //System.out.print(sen.replaceAll("[^a-zA-Z]", " ").replaceAll("[0-9]", " ").trim());
    String s[] = sen.replaceAll("[^a-zA-Z]", " ").replaceAll("[0-9]", " ").trim().split(" ");
    // for(String sNew:s)
    //   System.out.print(sNew + ":" );
    String longWord = s[0];
    int longLength = s[0].length();

    //for(int i=1;i<s.length;i++){
      for(String sNew:s){
        if(longLength < sNew.length()){
          //System.out.print(sNew + ":" );
          longLength = sNew.length();
          longWord = sNew;
        }
    }
    return longWord;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(LongestWord(s.nextLine())); 
  }

}