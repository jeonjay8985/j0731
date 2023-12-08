package j0731;

class Calculator {
	int num1;
	int num2;
	double d1;
	double d2;
	int res;
	double res1;
	
	Calculator(int n1, int n2) {
	 res= n1+n2;
     System.out.printf("%d + %d=%d\n", n1, n2, res);		
     res= n1-n2;
     System.out.printf("%d - %d=%d\n", n1, n2, res);	
     res= n1*n2;
     System.out.printf("%d * %d=%d\n", n1, n2, res);		
     if(n2==0) {
    	 System.out.println("0으로 나눌 수 없습니다");
     }else {
     res= n1/n2;
     System.out.printf("%d / %d=%d\n", n1, n2, res);		
     res= n1%n2;
     System.out.printf("%d %% %d=%d\n", n1, n2, res);		
	}
} 
	Calculator(int n1, double d1) {
	res1=n1+d1;
	System.out.printf("%d + %.2f = %.2f\n", n1, d1, res1);
	res1=n1-d1;
	System.out.printf("%d - %.2f = %.2f\n", n1, d1, res1);
	res1=n1*d1;
	System.out.printf("%d * %.2f = %.2f\n", n1, d1, res1);
	if(d1==0.0) {
		System.out.println("0으로 나눌 수 없습니다");
	} else {
	res1=n1/d1;
	System.out.printf("%d / %.2f = %.2f\n", n1, d1, res1);
	res1=n1%d1;
	System.out.printf("%d %% %.2f = %.2f\n", n1, d1, res1);
	}
  }
	Calculator(double d1, int n1) {
		res1=d1+n1;
		System.out.printf("%.2f + %d = %.2f\n", d1, n1, res1);
		res1=d1-n1;
		System.out.printf("%.2f - %d = %.2f\n", d1, n1, res1);
		res1=d1*n1;
		System.out.printf("%.2f * %d = %.2f\n", d1, n1, res1);
		if(n1==0.0) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
		res1=d1/n1;
		System.out.printf("%.2f / %d = %.2f\n", d1, n1, res1);
		res1=d1%n1;
		System.out.printf("%.2f %% %d = %.2f\n", d1, n1, res1);
		}
	} 
	 Calculator(double d1, double d2) {
		res1=d1+d2;
		System.out.printf("%.2f + %.2f = %.2f\n", d1, d2, res1);
		res1=d1-d2;
		System.out.printf("%.2f - %.2f = %.2f\n", d1, d2, res1);
		res1=d1*d2;
		System.out.printf("%.2f * %.2f = %.2f\n", d1, d2, res1);
		if(d2==0.0) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
		res1=d1/d2;
		System.out.printf("%.2f / %.2f = %.2f\n", d1, d2, res1);
		res1=d1%d2;
		System.out.printf("%.2f %% %.2f = %.2f\n", d1, d2, res1);
		}
	 }
}
public class exam03 {

	public static void main(String[] args) {
		// 다형성-오버로드. 생성자 Calculator로 같지만 매개변수만 다름!
		
		Calculator cal1=new Calculator(100, 200);
		Calculator cal2=new Calculator(100, 200.5);
		Calculator cal3=new Calculator(100.5, 200);
		Calculator cal4=new Calculator(100.5, 200.5);

	}

}
