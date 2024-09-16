package java8;

public class StringMaxDitgit {

	public static void main(String[] args) {
		String s="335467";
		int mx=0;
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i)-48;
			System.out.print(ch+" ");			
			if(ch>=mx) {
				mx=ch;
			}
		}
		System.out.println("\nmax Digit:"+mx);

	}

}
