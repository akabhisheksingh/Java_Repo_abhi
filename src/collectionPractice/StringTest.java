package collectionPractice;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a String");
		String st = sc.nextLine(); 
		System.out.println(st.length());
		char ch[]= st.toCharArray();
		String rev = ""; 
		for( int i =st.length()-1; i>=0; i--)
		{
			if((char)ch[i]>=50 &&(char)ch[i]<=57)
			{
				int k=Integer.parseInt(String.valueOf(ch[i]));
				while(k>0)
				{
					rev=rev+ch[i-1];
					k--;
				}
			}
			else
			{
			rev = rev+ch[i]; 
			}
		}
		System.out.println(rev);
		System.out.println(rev.length());
	}

}
