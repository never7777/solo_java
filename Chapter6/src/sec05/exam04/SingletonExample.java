package sec05.exam04;

public class SingletonExample {
	public static void main(String[] args) {
	
		/*
		Singleton obj1= new Singleton(); //컴파일 에러
		Singleton obj2= new Singleton(); //컴파일 에러
		
		 생성자의 접근제한자를 private로 설정했기 때문에 new 객체를 생성 할 수 없음
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
