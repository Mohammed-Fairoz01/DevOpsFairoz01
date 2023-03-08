class Reverse{
  static void reverse(String str){
    char a[]=str.toCharArray();
    String rev ="";
    for(int i=a.length-1; i>=0; i--){
      rev = rev+a[i];
    }
    System.out.println(rev);
  }
  public static void main(String args[]){
    reverse("I am Fairoz");
  }
}