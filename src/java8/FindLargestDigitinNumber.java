package java8;

import java.util.Scanner;

public class FindLargestDigitinNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		
		long max=maxDigitInNumber(num);
		System.out.println("Max Didgit is::"+max);
	}

	private static long maxDigitInNumber(long n) {
		
		long rem;long arr[]=new long[20];long i=0;
		String s = ""; s+=n;
		System.out.println(s);
		while(n!=0) {
			rem=n%10;  

			arr[(int)i++]=rem;
			n=n/10;
		}
		long max=arr[0];
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]>=max) {
				max=arr[j];
			}
			//System.out.print(arr[j]+" ");
		}
	return max;
	}

}
