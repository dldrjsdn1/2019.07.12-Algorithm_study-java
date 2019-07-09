package ExtendsEx;
//super(변수)로 부모의 변수를 물려받음.
public class Extends_ex5_child extends Extends_ex5_parent{
	private int studentNO;
	
	public Extends_ex5_child(String name,int studentNO) {
		super(name);
		this.studentNO = studentNO;
	}
}
