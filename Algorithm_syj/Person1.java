
public class Person1 {
	private int age;
	private char sex;
	private String address;

	Person1() {
		this.age = 22;
		this.sex = 'f';
		this.address = "작동";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person1(int age, char sex, String address) {
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (this.age != other.age)
			return false;
		if (this.sex != other.sex)
			return false;
		if (!this.address.equals(other.address))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person1 [age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}
	// 파라미터 int로 몇개든 받을 수 있음
	public void hello(int ...is) {
		System.out.println("안녕하세요" + this.age);
	}

}
