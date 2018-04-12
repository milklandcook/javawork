package javastudy1;

class Rect {
	private double width, length; //�ʵ�(�������)
	//�⺻������
	public Rect() {
		this.width=10.0;
		this.length=10.0;
	}


	
	
	//�Ű����� 2�� ������
	public Rect(double width, double length) {
		this.width = width;
		this.length = length;
	
}


public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}




	public double getLength() {
		return length;
	}




	public void setLength(double length) {
		this.length = length;
	}
	//��� �޼���
	public double calcArea() {
		return width*length;
	}
	//toString() : ��ü�� ó���� ����� ���ڿ��� ����
	//������ü(object)���� �����ϴ� �޼���
	public String toString(){ 	
		return "����"+width +
		"����" + length + "���̴�"+calcArea();
		//��� ����
	}
}

public class RectangleTest {
	public static void main(String[] args) {
		Rect r1 = new Rect (); //�⺻������
		System.out.println("���� = "+ r1.getWidth() +
				"����="+r1.getLength()+"���̴�="+ r1.calcArea());
		Rect r2 = new Rect(5.5, 10.0); //�Ű����� ������
		System.out.println(r2);//��ü ������� ==> toString()
		r2.setWidth(20.0);
		System.out.println(r2.toString());
	}

}