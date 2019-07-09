package ExtendsEx;

public class Ex_6_Child extends Ex_6_Parent{
	private String name;
	
	public Ex_6_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Ex_6_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

//super()가 생략되어있다. super()는 부모의 생성자를 불러와 초기화 한다.
//차식을 실행 시킬시 super()가 실행되어 부모클래스가 먼저 실행되고 자식이 실행된다.
//그래서 결과값이 Ex_6_ChildExample 같이 나온다.
