package javastudy;

import java.util.Scanner;

public class SwitchEx1 {
	
	public static void main(String[] args) {
		//�⺻ switch
		int num=6;
		switch(num){
		case 1:	//if(num==1)
			System.out.println("sk");
			break;
		case 6:
			System.out.println("KTF");
			
				
				// TODO Auto-generated method stub
				//ȭ�鿡 1-5���� ���� ����ִ� ����
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);

				//���� ��µǴ� ������ for������ ����
				for(int i=1; i<=5; i++) {
					System.out.println(1);
					//i=1 ==> i<=5(true) ==> ���(1)
					//i=2 ==> i<=5(true) ==> ��� (1)
				
				}
				
				//1-10������ ��
				int i1, sum =0;
				for (i1=1; i1<=10; i1++){
					sum+=i1; //sum=sum+i1;
					//i1=1 ==> ����(true) ==> sum=0+1 ==> sum=1
					//i1=2 ==> ����(true) ==> sum = 1+2 ==> 3
					System.out.print(i1);
					if (i1 <=99){
						System.out.print("+");
					}else {
						System.out.println("=");
						System.out.println(sum);
					}
				}
				
				//����ڷ� ���� �Է¹��� ���� �ݺ�
				int dan =0;
				System.out.println("���� �Է��ϼ���>>");
				Scanner scanner = new Scanner(System.in);
				dan= scanner.nextInt();
				for (int i2=1; i2 <=9; i2++)
				 System.out.println
				 (dan + "*" + i2 + "=" + dan*i2);
				}
		
				//2-9�ܱ��� �ݺ��ϱ�
				//���� �ݺ� (2~9)
				//�� �ܸ��� (1~9)
		
				for(int i3=2; i3<10; i3++){
					//���� �ݺ�
					for(int j3=1; j3 < 10; j3++) {
						System.out.println(i3+ "*" +j3 + "=" +i3*j3);
						//i3=2==> ���� (true) ==> j3=1 ==> ����(true) ==> 2*1
											//==>j3=2 ==> 2*2
											//==> j3=9 ���� �ݺ�
						//i3=3 ==> ���� (true) ==> j3�� 9�� �� �� ���� �ݺ�
						
					}
				}
	}
		
	}
	
				
				
				
				
	