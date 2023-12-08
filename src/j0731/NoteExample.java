package j0731;


class Notebook{
	String maker;            //앞에 private가 붙으면 아무나 접근할 수 없음!, 간접 접근 방식
	int price;
	
	void print() {
		System.out.printf("회사는 %s이고, 가격은 %d원입니다\n", maker, price);
		//		System.out.printf("회사는 %s이고, 가격은 %d원입니다\n", note1.getMaker(), note1.getPrice()); //정보 받아오는것
	}

	public String getMaker() {              //데이터 넘겨주는것Setters 데이터 받는것Getters
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class NoteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook note1=new Notebook();
		Notebook note2=new Notebook();			
		Notebook note3=new Notebook();
		
		note1.setMaker("samsung"); //간접연결
		//note1.maker="samsung";   //인스턴스 3개 생성, .으로 연결하는것은 직접연결, 보안에 취약함
		note1.setPrice(1500000);      
		//note1.price=1500000;     
		
		note2.setMaker("LG");
		note2.setPrice(1450000);
		//note2.maker="LG";
		//note2.price=1450000;
		
		note3.setMaker("Apple");
		note3.setPrice(2500000);
		//note3.maker="Apple";
		//note3.price=2500000;
		
		note1.print();
		note2.print();
		note3.print();
		
	}

}
