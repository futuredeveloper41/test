package ininheritance;

// 생성자가 있는 부모 클래스
class cal3{
	public int v1;
	public int v2;
	public cal3(int v1, int sdfsdfsdfsdf2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public int sum() {
		return this.v1+this.v2;
	}
	
}

class cal4 extends cal3{

	// super() : 생성자가 있는 클래스 상속받았다면, 자식 클래스도 생성자를 만들어서 만드시 부모 클래스를 호출해야 한다.
    public cal4(int v1, int v2) {
    	super(v1, v2);
	}
	
	public int minus() {return this.v1-this.v2;}
}

public class consutrctor {
	public static void main(String[] args) {
		cal3 df = new cal3(2,1);
		cal4 df1 = new cal4(2,1);
		System.out.println(df1.sum());
		System.out.println(df1.minus());
	}

}
