class Replace{
  static void change(String str){
    String str1 = str.replace("f", "F");
    System.out.println(str1);
  }
  public static void main(String args[]){
    change("fairoz");
  }
}