package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// final 필드이기 때문에 값을 변경할 수 없음. 
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
	
	}
}
