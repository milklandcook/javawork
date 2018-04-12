package javastudy;

import java.util.Scanner;

public class SwitchEx1 {
	
	public static void main(String[] args) {
		//기본 switch
		int num=6;
		switch(num){
		case 1:	//if(num==1)
			System.out.println("sk");
			break;
		case 6:
			System.out.println("KTF");
			
				
				// TODO Auto-generated method stub
				//화면에 1-5까지 숫자 찍어주는 예제
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);

				//위에 출력되는 내용을 for문으로 변경
				for(int i=1; i<=5; i++) {
					System.out.println(1);
					//i=1 ==> i<=5(true) ==> 출력(1)
					//i=2 ==> i<=5(true) ==> 출력 (1)
				
				}
				
				//1-10까지의 합
				int i1, sum =0;
				for (i1=1; i1<=10; i1++){
					sum+=i1; //sum=sum+i1;
					//i1=1 ==> 조건(true) ==> sum=0+1 ==> sum=1
					//i1=2 ==> 조건(true) ==> sum = 1+2 ==> 3
					System.out.print(i1);
					if (i1 <=99){
						System.out.print("+");
					}else {
						System.out.println("=");
						System.out.println(sum);
					}
				}
				
				//사용자로 부터 입력받은 값을 반복
				int dan =0;
				System.out.println("단을 입력하세요>>");
				Scanner scanner = new Scanner(System.in);
				dan= scanner.nextInt();
				for (int i2=1; i2 <=9; i2++)
				 System.out.println
				 (dan + "*" + i2 + "=" + dan*i2);
				}
		
				//2-9단까지 반복하기
				//단의 반복 (2~9)
				//각 단마다 (1~9)
		
				for(int i3=2; i3<10; i3++){
					//단의 반복
					for(int j3=1; j3 < 10; j3++) {
						System.out.println(i3+ "*" +j3 + "=" +i3*j3);
						//i3=2==> 조건 (true) ==> j3=1 ==> 조건(true) ==> 2*1
											//==>j3=2 ==> 2*2
											//==> j3=9 까지 반복
						//i3=3 ==> 조건 (true) ==> j3을 9가 될 때 까지 반복
						
					}
				}
	}
		
	}
	
				
				
				
				
	