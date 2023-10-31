import java.util.Scanner;

public class pangram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine();  //string for input and testing
		boolean c[]=new boolean[26]; //bool array for checking whether char a to z are present or not?
		
        for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z' && !c[s.charAt(i)-'a']){
				c[s.charAt(i)-'a']=true;
			}
        }
		for(int i=0;i<26;i++){
			if(!c[i]){
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("Pangram");
	}
}