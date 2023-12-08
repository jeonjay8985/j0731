package j0731;

   class Student{  
	String name;   
	int no;
	int kor;
	int eng;
	int mat;
	int sum;
	double avg;
	
	void print() {
		System.out.printf("학번:%d, 이름:%s, 국어:%3d, 영어:%3d, 수학:%3d, 합계:%3d, 평균:%.3f\n", no, name, kor, eng, mat, sum, avg);
       }
   }
    public class StudentExample {

	public static void main(String[] args) {
		/* 클래스 실습
		 클래스 속성: 학번(no) int;
		           이름(name) String;
		           국어(kor): int
		           영어(eng): int
		           수학(mat) int
		 인스턴스 속성: 5명에 대한 인스턴스
		 ex. no1 4번:20010001 이름:홍길동 국어:90 영어:70 수학:80 합계:240
		     no2 14번:20010002 이름:홍길동 국어:90 영어:70 수학:80 합계:240
		     no3 14번:20010003 이름:홍길동 국어:90 영어:70 수학:80 합계:240
		     no4 14번:20010004 이름:홍길동 국어:90 영어:70 수학:80 합계:240
		     no5 14번:20010005 이름:홍길순 국어:70 영어:80 수학:80 합계:230 */
		
		
		Student first=new Student();
		first.no=1;
		first.name="홍길동";
		first.kor=90;
		first.eng=70;
		first.mat=80;
		first.sum=first.kor+first.eng+first.mat;
		first.avg=first.sum/3.0;
		first.print();
		//System.out.printf("학생1의 학번은 %d이고, 이름은 %s이며 세과목의 합계는 %d입니다.\n", first.no, first.name, first.sum);
		
		Student second=new Student();
		second.no=2;
		second.name="홍길다";
		second.kor=60;
		second.eng=70;
		second.mat=50;
		second.sum=second.kor+second.eng+second.mat;
		second.avg=second.sum/3.0;
		second.print();
		//System.out.printf("학생2의 학번은 %d이고, 이름은 %s이며 세과목의 합계는 %d입니다.\n", second.no, second.name, second.sum);
		
		
		Student third=new Student();
		third.no=3;
		third.name="홍길아";
		third.kor=50;
		third.eng=90;
		third.mat=80;
		third.sum=third.kor+third.eng+third.mat;
		third.avg=third.sum/3.0;
		third.print();
		//System.out.printf("학생3의 학번은 %d이고, 이름은 %s이며 세과목의 합계는 %d입니다.\n", third.no, third.name, third.sum);
		
		Student fourth=new Student();
		fourth.no=4;
		fourth.name="홍길숙";
		fourth.kor=50;
		fourth.eng=10;
		fourth.mat=80;
		fourth.sum=fourth.kor+fourth.eng+fourth.mat;
		fourth.avg=fourth.sum/3.0;
		fourth.print();
		//System.out.printf("학생4의 학번은 %d이고, 이름은 %s이며 세과목의 합계는 %d입니다.\n", fourth.no, fourth.name, fourth.sum);
		
		Student fifth=new Student();
		fifth.no=5;
		fifth.name="홍길순";
		fifth.kor=20;
		fifth.eng=90;
		fifth.mat=80;
		fifth.sum=fifth.kor+fifth.eng+fifth.mat;
		fifth.avg=fifth.sum/3.0;
		fifth.print();
		//System.out.printf("학생5의 학번은 %d이고, 이름은 %s이며 세과목의 합계는 %d입니다.\n", fifth.no, fifth.name, fifth.sum);
		

	 }
    }
   
