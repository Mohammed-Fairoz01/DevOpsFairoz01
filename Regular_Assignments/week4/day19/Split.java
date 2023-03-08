class Split{
    static void split(String str){
    String str1[]= str.split("r"); 
      for(int i=0; i<=str1.length-1; i++)
         System.out.println(str1[i]);
  }
  public static void main(String args[]){
    split("fairoz");
  }
}