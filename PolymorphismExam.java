class CarCenter{
	public void engineer(Car cd){    //같은 폴더라 car타입 바로 사용 가능

		System.out.println("cd주소:"+cd);   //두 개 다 같은 곳을 가리킴
		//System.out.println("cd.a:"+cd.a);   //부모 타입 변수는 부모 부분만 접근 가능


		//cd변수 자식 부분을 접근 가능하도록 형변환 필요

		if(cd instanceof Excel){
		Excel e = (Excel)cd;  //cd를 Excel 타입에 담아라  -> 앞에 자식 타입으로 형변환 -> ObjectDownCasting(이것 쓸 때는 반드시 instanceof를 써서 오류 줄이기)
		System.out.println("e주소 :"+e);
		System.out.println("e.a:"+e.a);
		}

		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		 
		//다형성 덕분에 차종 늘어날 때마다 오버로딩할 필요 없음
		//다형성은 객체와 관련, 오버로딩은 객체의 기능인 메소드와 관련
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
		cc.engineer(c);//원래 car에서는 초기값이었으니깐
		cc.engineer(ef);//EfSonata 타입(다형성 때문에 ef는 car타입이니깐 engineer에 담길 수 있음),부모에게 상속받은 부분만 접근(이미 cost,carname은 이름 변경돼 있음)
		cc.engineer(ca);//Car cd= ca       

		System.out.println("ex주소 :" + ex);
		System.out.println("ex.a = "+ex.a);
		
		cc.engineer(ex);//
		
		
	
	}
}
