package j0731;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 실습03
		
       Scanner s1=new Scanner(System.in);
		
		System.out.print("출석 점수를 입력하세요 :");
		float attendance=s1.nextFloat();
		System.out.print("과제 점수를 입력하세요 :");
		float task=s1.nextFloat();
		System.out.print("수시시험 점수를 입력하세요 :");
		float test1=s1.nextFloat();
		System.out.print("중간시험 점수를 입력하세요 :");
		float test2=s1.nextFloat();
		System.out.print("기말시험 점수를 입력하세요 :");
		float test3=s1.nextFloat();
		
		float total = attendance/100*10+ task/100*40+ test1/100*10+ test2/100*20+ test3/100*20;
		
		System.out.println("총점 : " + total);
		if(total>=90) {
			System.out.print("학점 : A");
		}else if(total<90 && total>=80) {
			System.out.print("학점 :B");
		}else if(total<80 && total>=70) {
			System.out.print("학점 :C");
		}else if(total<70 && total>=60) {
			System.out.print("학점 :D");
		}else {
			System.out.print("학점 :F");
		}
		
		
		


	}

}
