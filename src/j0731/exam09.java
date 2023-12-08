package j0731;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		// 실습06
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("문자열을 입력 ==> ");
		String str=s1.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	

	}

}
