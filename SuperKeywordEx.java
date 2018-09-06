class Super{
	int a=5;
	int b=10;
	public void aa(){
		System.out.println("super의 aa() 호출됨...");
	}
	public void bb(){
		System.out.println("super의 bb() 호출됨...");
	}
}
/////////////////////////////////////////////////////
class Sub extends Super{
	int a=7;
	int c=20;
	public void aa(){
		System.out.println("sub의 재정의된 aa() 메소드 호출됨...");

		/*System.out.println(a);  //7
		System.out.println(this.a);  //7
		System.out.println(super.a);  //5

		System.out.println("-------");
		System.out.println(b);  //10
		System.out.println(this.b);  //10
		System.out.println(super.b);  //10
		
		System.out.println("-------");
		System.out.println(c); //20
		System.out.println(this.c);  //20*/
		//System.out.println(super.c);  //오류

	}
	public void cc(){
		System.out.println("sub의 cc() 메소드 호출됨...");
	
	}
	public void dd(){
		aa();
		this.aa();
		super.aa();
		System.out.println("---------------");
		bb();
		this.bb();
		super.bb();
		System.out.println("---------------");
		cc();
		this.cc();
		//super.cc();

	}
}

/////////////////////////////////////////////////////
class SuperKeywordEx {
	public static void main(String[] args) {
		//new Sub().aa();
		//new Sub().dd();

		//외부에서 객체 생성해서 접근하기
		Sub sub = new Sub();  //sub변수는 전체를 다 접근 가능하다
		System.out.println(sub.a);  //7
		System.out.println(sub.b);  //10
		System.out.println(sub.c);  //20

		System.out.println("-------------------------------");
		sub.aa();
		sub.bb();
		sub.cc();

		System.out.println("\n---부모타입 변수로 접근한 경우---");
		Super sp = new Sub();  //부모 타입 부분만 접근 가능(단, 재정의된 메소드는 자식 접근)
		System.out.println(sp.a);   //부모 a = 5
		System.out.println(sp.b);   //부모 b = 10
		//System.out.println(sp.c);   //부모에 c 없어서 접근 불가  -> ObjectDowncasting 필요

		System.out.println("\n-------------------------------");
		sp.aa();    //재정의된 메소드이므로 자식부분이 호출된다
		sp.bb();
		//sp.cc();    //자식부분이라 접근 불가  ->  ObjectDowncasting 필요

		System.out.println("---------------------------------");
		Sub s = (Sub)sp;     //자식보다 부모가 크니깐, 상속 관계일 때 ObjectDowncasting 가능하다

		System.out.println("sp = "+sp);		
		System.out.println("s = "+s);     //sp와 s 주소 같음, 같은 객체를 가리킴

		System.out.println("\n"+s.c);
		s.cc();
 

	}
}
