package javastudy;

public class Op1 {

	public static void main(String[] args) {
	
		//���� ����
		int remainder = 25%2; //����Ÿ�� ������ = �� 
		System.out.println("�������� "+ remainder + "��");

		//�񱳿�����
		
		int x=0, y=1;
		boolean z;
		z= ((x<1) || (y--<1));
		System.out.println("����� : " +z);
		z= ((x<1) && (y--<1));
		System.out.println("����� : " +z);
	
		//���Կ�����
		int value=1;
		value *= 2;// value = value-2;
		System.out.println("��� " + value);	
		
		//��ȣ ������
		x=1;
		y=1;
		System.out.println("x="+x+"x++="+ x++); //x=x+1
		System.out.println("x="+x+"x++="+ --x);
		System.out.println("y="+y+"y++="+ y++);
		System.out.println("y="+x+"y++="+ --y);
		
		//���� ������
		x=3;
		y=(x==1)? 10 : 20; //����?���϶���: �����϶���;
		System.out.println("����� : "+ y);
	}

}
