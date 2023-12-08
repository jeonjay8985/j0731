package j0731;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// 실습04
		
		 Scanner s1=new Scanner(System.in);
			
		System.out.print("총 이수학점을 입력하세요 :");
	     int credit=s1.nextInt();
		System.out.print("TOEIC 점수를 입력하세요 :");
		 int toeic=s1.nextInt();
		 
		 if(credit>=140 && toeic>=700) {
			 System.out.print("졸업을 축하합니다");
		 }else if(credit>=140 && toeic<700) {
			 System.out.print("아쉽지만 수료하셨습니다");
		 }else if (credit<140) {
			 System.out.print("졸업이 불가합니다");
		 }

	}

}
