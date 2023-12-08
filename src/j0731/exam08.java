package j0731;

public class exam08 {

	public static void main(String[] args) {
		// 실습05
		
		for(int i=1; i<=10; i++) {
			int result=1;         //결과값 초기화
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ", j);
				if(j==i) {
					System.out.print(" = ");
				}else {
					System.out.print(" * ");
				}
				result=result*j;	
			} 
			System.out.print(result);   //result는 i안에 있어야 함!
			System.out.println();
		} 
		
	}

}
