
public class Person {
	String name;
	int age;
	
	public Person() {
		age = 1;
		name = "null";
	}
	
	public Person(int age , String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	// a.equals(b);
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	public int num(int a , int b) {
		return 0;
	}
	
	public int num(int a , int b , int c) {
		return 0;
	}
	
	
}
