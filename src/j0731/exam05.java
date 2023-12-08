package j0731;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// 실습 02
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("고객이 구입한 제품의 수량을 입력하세요 :");
		int num=s1.nextInt();
		
		int fee=10000;
		int fee1;
		if(num>=10) {
		 fee1=fee/100*90;
		 System.out.printf("%d원 입니다 :" ,fee1*num);
		}else {
		 System.out.printf("%d원 입니다 :" ,fee*num);
		}

	}

}
