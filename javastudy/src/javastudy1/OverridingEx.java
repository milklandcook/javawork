package javastudy1;

class Shape {
	public void draw(){
		System.out.println("����");
	}//������ ����Ÿ�� �޼����̸�(�Ű�����..)
}

class Line extends Shape{
	public void draw(){
		System.out.println("��");
	}

}

class Rect1 extends Shape {
	public void draw() {
		System.out.println("�簢��");
	}

}

class Circle1 extends Shape {
	public void draw() {
		System.out.println("��");
	}

}
		
public class OverridingEx {
	static void paint(Shape p){
		p.draw(); //����Ŭ������ �ִ� draw()
	}
	public static void main(String[] args) {
		//�޼��� ȣ��
		Line line = new Line();
		paint(line); // shape line ==> line�� drawȣ��
		//�������̵� �� �޼����
		//�ϴ� ���ļ� ����� ���̹Ƿ�
		//���� Ŭ������ �ִ� �޼��尡 �켱������ ����
		paint(new Line());
		line.draw();//����
}

}
