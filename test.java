package ininheritance;

class cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}	
}

// ���(inheritance) : class Ŭ������ extends ����� Ŭ������
// ����� ���� : ����� Ŭ������ �����ϸ�, Ȯ���� Ŭ�������� �ڵ� �ݿ��ȴ�
class cal1 extends cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// overriding(�����) : �ڽ� Ŭ�������� �θ� Ŭ������ �Լ��� ������� �ۤ��� �ٸ� ����� ������ ��, �ڽ� Ŭ������ ���� �̸��� ���� �Ű������� �������ؼ� ����ϴ� ��
    public int sum(int v1, int v2) {
    	System.out.println("overriding �� �� : ");
    	return v1+v2;
	}
    
	// overloading(�޼ҵ� �ߺ� ����) : ���� �̸��� �޼ҵ忡 �Ű������� �ٸ��� ����Ͽ� �Ű� ������ ���� �ٸ� �Լ� ����
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
