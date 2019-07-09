//this("") -> 생성자를 의미, this.nation -> 클래스의 변수를 의미
package ExtendsEx;

public class Ex_6_Parent {
	public String nation;
	
	public Ex_6_Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Ex_6_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
