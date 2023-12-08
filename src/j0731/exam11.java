package j0731;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		// 실습08
		
		Scanner s1=new Scanner(System.in);
		
	
		String str;   //문자열 변수 선언
		char ch;      //문자형 변수 선언
		int i;        //정수형 변수 선언
		int k;        //정수형 변수 선언
		int star;     //별의 개수 추출
		
		System.out.println("숫자를 여러개 입력: ");
		str=s1.nextLine();
		
		i=0;               //문자열의 위치를 나타낼 변수
		ch=str.charAt(i);  //문자열에서 한 글자(숫자)를 추출한다(첫번째 숫자)
		
		while(true) {
			star = (int)ch-48; //문자->숫자로 변환 (아스키값 문자-48(:5)=숫자(:5))
			
			for(k=0; k<star; k++)
				System.out.printf("*"); //별의 개수 출력
			System.out.printf("\n");    //한 줄 띄우기
		
			if(++i > str.length()-1) {  //i를 1 증가시킨 후 
				break;                   //문자열 길이 -1보다 크면 while문 종료
			}ch = str.charAt(i);         //문자열에서 한글자(숫자)추출
		}
		
	}

}


