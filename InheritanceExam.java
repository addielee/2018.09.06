
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}
/////////////////////////////////////////////////////////////////////
//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
	//각 클래스에 인수를 받지않는 생성자 작성
	//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

	class EfSonata extends Car{
		EfSonata(){
			carname = "ES";     
			//다시 선언하면 안됨, 위에 있는 거 받아오니깐  //this.carname 으로도 받아올 수 있음 //부모 것이니깐 super.carname으로도 가능
			//String carname 일 때 null 뜨는 이유 : 이름이 중복되면 가장 가까운 것을 호출하는데 System.out은 부모 클래스에 있고 가장 가까운 변수는 값 지정안된 carname(초기화)
			cost = 25000;
		}
	}
	class Excel extends Car{
		int a = 100;
		Excel(){
			carname = "Ec";
			cost = 30000;
		}
	}
	class Carnival extends Car{
		Carnival(){
			carname = "Cn";
			cost = 35000;
		}
	}
	
	

public class InheritanceExam{
	//메인메소드에서 
	public static void main(String [] args){

		//Car, EfSonata, Excel, Canival 네개의 객체를 생성
		// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.

		Car car = new Car();         //자기 자신 타입에 담음,  생성자 호출
		EfSonata ef = new EfSonata();
		Excel excel =new Excel();
		Carnival can = new Carnival();

		car.printAttributes();
		ef.printAttributes();
		excel.printAttributes();
		can.printAttributes();
		
	}
}

