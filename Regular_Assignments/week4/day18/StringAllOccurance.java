import java.util.Scanner;

public class StringAllOccurance{

	static void Occurance(String[] args) {
		String Str;
		char ch;
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter any String =  ");		
		System.out.print("\nEnter the Character to Find =  ");
		ch = sc.next().charAt(0);
		
		FindAllCharacterOccurences(Str, ch);	
	}
	
	public static void FindAllCharacterOccurences(String Str, char ch) {
		for(int i = 0; i < Str.length(); i++)
		{
			if(Str.charAt(i) ==  ch) {
				System.out.format("\n %c Found at Position %d ", ch, i);
			}
		}
	}
}