import java.util.*;
class AlphaDigit{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    String acount="",dcount="";
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
      {
        acount =acount+ch[i];
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        dcount=dcount+ch[i];
      }
    }
    System.out.print(acount);
    System.out.print(dcount);
  }
 
  
  
  public static void main(String args[]){
    characterCount("a1d2c3");
    
   
    
  }
}