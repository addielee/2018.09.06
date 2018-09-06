class Parent{
	Parent(){
		System.out.println(1);
	}
	Parent(int i){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
}
////////////////////////////////////////////////
class Child extends Parent{
	Child(){
		//this(100);
		System.out.println(4);
		
	}
	Child(int i){
		System.out.println(5);
	}
	Child(boolean b){
		System.out.println("하하");
		System.out.println(6);
	}
}
class SuperConstructorExam {
	public static void main(String[] args) {
		//new Child();   //1,4
		//new Child(100);  //1,5  부모의 기본생성자
		//new Child("안녕");    //Child에 String 받는 생성자가 없으므로 오류
		/////////////////////////////////////////////////////////////////////

		//2. 만약, 1,2,3 없다면(부모 생성자 없다면)
			 //new Child();    ///성공
			 //new Child(100);   //성공

		//이유: 생성자를 작성하지 않으면 기본생성자(인수없는 생성자) 자동추가


		////////////////////////////////////////////////////////////////////////
		
		//3.만약, 1은 없고, 2,3만 존재(즉 부모의 기본생성자가 없다)
		   //자식생성자 구현부 첫줄에서 모두 오류발생(부모의 기본생사성자 찾는다)
		   //만약 자식 생성자 구현부 첫줄에서 강제로 super() 아닌
		   //다른 생성자를 호출하도록 선언하면 오류를 해결할 수 있다.
	}
}
