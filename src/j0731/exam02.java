package j0731;

class For1 {
	int start;
	int end;
	int sum;     //sum 자동으로 0으로 초기화
	
	For1() {
		
		
	}
	For1(int st, int en) {
		for(int i=st; i<=en; i++) {
			sum=sum+i;
		}
		System.out.printf("%d부터 %d까지의 합 : %d\n", st, en, sum);
	}
}


public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		For1 f1=new For1(1, 100);        //1-100까지의 합. For1(oo, oo)의 형태를 찾아감
		For1 f2=new For1(101,200);       //101-200까지의 합
		
		/*int sum;
		for(int i=1; i<=100 ; i++) {
			sum=sum+i;*/  //sum 초기화가 되지 않았기 때문에 에러뜸
		}
		
	}


