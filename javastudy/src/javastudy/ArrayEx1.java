package javastudy;

import java.util.Scanner;

public class ArrayEx1 {
	private static char[] sum1;

	public static void main(String[] args) {
		//������ �̿��� ��
		int score1, score2, score3;
		score1=100;
		score2=33;
		score3=44;
		int sum=score1+score2+score3;
		System.out.println(sum);
		
		//�迭 �̿��ѿ�
		int sum1=0;
		int[] scores = {100,33,44};
		//int scores[] ={100,33,44}; //����ǥ��
		for (int i=0;  i<3; i++){
			sum1+=scores[i];
			//sum= sum+ scores[i]; //���� ǥ��
			//i=0 ==> sum+scores[0];
		}
		System.out.println(sum1);
	
		//�迭 new �����ڷ� ����
		String[] name= new String[3];
    	//Ÿ��[] �迭��= new Ÿ�� [�迭ũ��];
		name[0]= "�̸�1";
		name[1]="�̸�2";
		name[2]="�̸�3";
		//String [] name={"�̸�1", "�̸�2", "�̸�3"};
		//�迭�� �� ����
		
	//�迭�� ���
		for(int i1=0; i1<name.length; i1++){
		System.out.println(name[i1]);
		}
		
	// Ű����� ���� �Է¹޾Ƽ� �ִ밪
	Scanner scanner = new Scanner(System.in);	
	int intArray[] = new int[5];
	int max=0;
	
	System.out.print(" 5���� ������ �Է��ϼ���>>");
	//�迭�� �� �����ϱ�
	for (int i2=0; i2 <intArray.length; i2++){
		intArray[i2]= scanner.nextInt();
		//�ִ밪 ���ϱ�
		if(intArray[i2] > max){
			//���� �迭�� ����� ���� max���� ��
			max=intArray[i2];
		}
	}
	
	//�迭�� ó���Ѱ����
	System.out.println("����ū����"+max+ "�Դϴ�");
	
	//�迭 ������ for-each ������ ����� ��
	
	String f[]= {"��1", "��2", "��3"};
	//�迭 ���� ���� (for-each��)
	for (String s : f){ //f[0], f[1]....
		
		System.out.print(s + " , ");
		
	}
	//for(int i=0; i<f.length; i++) {
	// f[i];
	
	//5���� ������ �Է¹޾Ƽ� 3�� ����� ����ϱ�
	
	//1> �迭����
	int n[]=new int [5];
	System.out.println("5���� ���� �Է�>>");
	//2> �Է¹��� ���� �迭�� ����������
	for(int i3=0; i3<n.length; i3++){
		n[i3]=scanner.nextInt();
		
		//3> �迭�� ���� %3==0 ���ٸ� ����ϱ�
		if(n[i3]%3==0){
			System.out.println(n[i3] + " ,");
		}
		}
	}
}
	
	