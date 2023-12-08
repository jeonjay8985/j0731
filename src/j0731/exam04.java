package j0731;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 실습 01
		
		Scanner s1=new Scanner(System.in);
	
		System.out.println("시험 점수를 입력하세요 :");
		int test=s1.nextInt();
		System.out.println("면접 점수를 입력하세요 :");
		int interview=s1.nextInt();
		
		if(test>=80 && interview>=60) {
			System.out.println("합격을 축하합니다");
		}else {
			System.out.println("아쉽지만 불합격입니다");
		}
	}
}


