package Exception_Ex;

public class Test1 {

	public static void main(String[] args) {

		
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			//비교해보기
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
