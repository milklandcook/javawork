package javastudy;

import java.util.Scanner;

public class StringEx1 {
public static void main(String[] args) {
	// ���ڿ��� ==> �迭ó�� �ε��� ��ȣ�� �����鼭 ����
	String a="Hello";
	String b=new String("java");
	
	System.out.println(a.length());
	System.out.println(a.substring(0, 2));
	System.out.println(a.charAt(3));
	String s[] =a.split(",");
	//���ڿ��� ,�� �����ؼ� �迭�� ����
	for(int i=0; i<s.length; i++){
		System.out.println(s[i]);
	}
	
	//���ڿ� + �迭�� Ȱ���� ������ �Է��ϸ� �ѱ۷� ����
	String eng[] = {"student", "love", "java", "happy", "future"};
	String kor[] = {"�л�", "���", "�ڹ�", "�ູ", "�̷�"};
	
	//����ڷ� �Է¹޾Ƽ� ���
	
	Scanner scanner = new Scanner(System.in);
	
	while(true){
		System.out.println("����ܾ��Է�>>");
		String s1=scanner.nextLine();
		if(s1.equals("exit")){
			break;//s1(�����Է��ѹ���)�� exit��� �߰�
		}
	  for (int i=0; i< eng.length; i++){
		 //�迭 ���� ��ŭ �ݺ�
		 if(eng[i].equals(s1)){
			 //�迭�� ����� ���� ���� �Է��� ��
			 System.out.println(kor[i]);
			 break;
		 }
	  }
			 
	 //����ڷ� ���� �Է¹��� �����ڸ� �빮�ڷ�
	char ch=' ';
	System.out.println("���ڸ� �Է��ϼ���>>");
	String input = scanner.nextLine();
	ch=input.charAt(0);
	
	if('a'<=ch && ch<='z'){
		ch=(char) (ch-32);
		
	 }else if ('A'<=ch && ch <='Z') {
		ch=(char) (ch+32);
	 }
	System.out.println(ch);
	System.out.println(input.toUpperCase());
	//toLowerCase() : �ҹ��ڷ�
	
		 }
	 }

}