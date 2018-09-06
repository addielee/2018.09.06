class ObjectExam{
	String str;
	public ObjectExam(){   }
	public ObjectExam(String str){  
		this.str=str;
	}
	
	//재정의
	public String toString(){   //부모인 Object에서 받아옴
		return str;  //전역변수 먼저 선언한 뒤 생성자에 this로 값 저장하고 여기서 필요할 때 불러옴
	}
}
/////////////////////////////////////////////
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");  //String은 객체라서 s01,s02,s03은 결국 주소값

			ObjectExam oe1=new ObjectExam();
			ObjectExam oe2=new ObjectExam("안녕");
           
			System.out.println(c);//

			/**
				println(Object obj) or print(Object obj) 메소드는
				인수로 객체가 전달되면 객체.toString()메소드가 호출되고
				그 메소드가 리턴하는 문자열을 출력한다.

				->Object는 모든 타입
				  그리고 이건 객체
			*/

			System.out.println(s01);//s01은 결국 s01.toString()임
			System.out.println(s02);//
			System.out.println(s03);//오버라이딩 되었기 때문에 이건 주소가 아니라 문자열로 나옴

			System.out.println(oe1);//
			System.out.println(oe2);//
			
	}
}
