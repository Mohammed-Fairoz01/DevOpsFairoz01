class StringToArray{
  static void convert(String str){
    char a[] = str.toCharArray();
    int count=0;
    for(int i=0; i<a.length; i++){
     if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
       count++;
     }
    }
    System.out.println(count); 
  } 
  public static void main(String args[]){   
    convert("Lalitha.ujjaneni@gmail@.con"); 
  }
}