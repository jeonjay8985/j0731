package j0731;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// 실습07
		Scanner s1=new Scanner(System.in);
		
		String str; 
		char ch;
		int upper_cnt=0;
		int lower_cnt=0;
		int num_cnt=0;
		
		System.out.print("문자열을 입력 :");
		str=s1.nextLine();
		
		int i=0;
		
		do {
			ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				upper_cnt++;
			if(ch>='a' && ch<='z')
				lower_cnt++;
			if(ch>='0' && ch<='9')
				num_cnt++;
			
			i++;
			
		}while(i<str.length());
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자%d개\n", upper_cnt, lower_cnt, num_cnt);
		
		/*
		Scanner s1=new Scanner(System.in);
		
		String str=s1.nextLine().toUpperCase();
		char input=s1.next().charAt(0);
		input= Character.toUpperCase(input);
		
		int answer=0;
		for (char c: str.toCharArray()) {
			if(input == c) {
				answer++;
			}
		}
		System.out.println(answer);
		
		
		
		===========================================
		Scanner s1=new Scanner(System.in);
		
		String str;
		char ch;
		int upper_cnt=0;
		int lower_cnt=0;
		int digit_cnt=0;
		
		System.out.print("문자열 입력 : ");
		str=s1.nextLine();
		
		int i=0;
		
		do {
			ch = str.charAt(i);       //입력된 글자를 한자한자 읽어들임!
			
			if(ch>='A' && ch<='Z')
				upper_cnt++;
			if(ch>='a' && ch<='z')
				lower_cnt++;
			if(ch>='0' && ch<='9')
				num_cnt++;
			
			i++;
			
		}while(i<str.length());
		
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자%d개\n", upper_cnt, lower_cnt, digit_cnt);
		
		
	}*/

	}
}
