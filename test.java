package ininheritance;

class cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}	
}

// 상속(inheritance) : class 클래스명 extends 상속할 클래스명
// 상속의 장점 : 상속할 클래스를 수정하면, 확장한 클래스에뎌 자동 반영된다
class cal1 extends cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// overriding(덮어쓰기) : 자식 클래스에서 부모 클래스의 함수를 사용하지 앟ㄴ고 다른 기능을 실행할 떄, 자식 클래스에 같은 이름에 같은 매개변수로 재정의해서 사용하는 것
    public int sum(int v1, int v2) {
    	System.out.println("overriding 된 값 : ");
    	return v1+v2;
	}
    
	// overloading(메소드 중복 정의) : 같은 이름의 메소드에 매개변수를 다르게 사용하여 매개 변수에 따라 다른 함수 실행
	public double sum(double v1, double v2) {
		return v1+v2;
	}
	
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}

}

public class test {
	
	public static void main(String[] args) {
		cal1 df = new cal1();
		System.out.println(df.minus(3, 1));
		System.out.println(df.sum(3, 5));
	}

}
