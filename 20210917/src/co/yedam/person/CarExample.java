package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		// 변수 이름 sonata
		Car sonata = new Car("소나다","SonataHybird" ,2000, 200, new Tire());
		sonata.getCarName();
		sonata.getCarModel();
		
	}
}
