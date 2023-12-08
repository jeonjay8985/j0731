package j0731;

class Car{          //클래스를 쓰는 이유: 객체지향의 장점?? 프로그램은 가격을 인건비로 매김. 인건비를 줄이려면 코드를 재사용해야. 비슷한 클래스 있으면 조금만 수정해서 가져다 쓸 수 있음. 코드의 재사용
	String color;   //자동차의 설계도
	int speed;      //int speed=0; 라고 설정하지 않아도 클래스안에서는 이미 0으로 초기화되어져있음!
	Car(){
		System.out.println("생성자");
	}             //생성자: U연산자로 실행할 때마다(빨강, 파랑, 노랑) 호출됨(즉, 3번 호출됨)
	Car(String color, int speed) {   //매개변수가 있는 생성자. 메인에서 넘어온 color
		this.color=color;            // 클래스(class Car) 자기 자신의 이름(칼라). 이름이 같을 경우만 구분짓기 위해 this를 붙임
		this.speed=speed; 
	}
	void upSpeed(int value) {
		speed=speed+value;
	}
	void downSpeed(int value) {
		speed=speed-value;
	}
}
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num;
		//num+10;하면 에러뜸. 초기화가 안되어 있기 때문에
		
       Car redCar=new Car(); //new 연산자 호출방법-> class();
       redCar.color="빨간색";
       redCar.speed=0;
       redCar.upSpeed(60);
       System.out.printf("자동차 1의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", redCar.color, redCar.speed); //redCar에소속된color, redCar에소속된speed
       
       
       Car blueCar=new Car();
       blueCar.color="파란색";
       blueCar.speed=100;
       blueCar.downSpeed(20);
       System.out.printf("자동차 2의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", blueCar.color, blueCar.speed);
    		   
       
       Car yellowCar=new Car();
       yellowCar.color="노란색";
       yellowCar.speed=30;
       yellowCar.upSpeed(40);
       System.out.printf("자동차 3의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", yellowCar.color, yellowCar.speed);
       
       
       Car grayCar=new Car("회색", 80);
       grayCar.upSpeed(10);
       System.out.printf("자동차 4의 색상은 %s이며, 현재 속도는 %dkm입니다.\n", grayCar.color, grayCar.speed);
       
	}

}
