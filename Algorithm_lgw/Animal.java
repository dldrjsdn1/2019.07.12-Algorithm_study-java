
public abstract class Animal {
		private String name;
		private int age;
		private String sex;
		
		Animal(String name, int age, String sex){
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		
		public abstract void eat();
		public abstract void speack();
		
	}


