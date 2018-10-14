package pkg1;

public class Class3 {
	
	public static void main(String[] args) {
		
		String s1="deepak";
		String s2="";
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);  // s2----n  n+i=ni ni+t=nit 
		}
		
		if(s1.equals(s2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
