package javastudy;

import java.util.Scanner;

public class WhileEx {
	
	public static void main(String[] args) {
		
		//1-10까지 합 ==> for을 while문으로
		int i=1, sum=0;
		while (i<=10){
			sum+=i;
			i++; //for(int i=0; i<=10; i++)
		}
		System.out.println("결과"+sum);
		
		// 사용자로 부터 입력받은 정수를 모두 더해서
		// 합계평균 구하기
		int count =0;
		int n=0;
		int sum1=0;
		double avg=0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력>>");
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		while (n!=0){
			sum +=n;
			count++;
		}
		avg=sum1/count;
		System.out.println("더한 총갯수"+ count);
		System.out.println("총합 : "+sum1);
		System.out.println("평균"+ avg);
		
		//for(i=0; i<=20; i=i+3) 
			
		for (i=1; i<=20; i++ ) {
			if(i%3==0) {
				sum = sum+i;
				System.out.println(sum);
		}
		System.out.println("총 합은 "+sum+"입니다.");
		
		}
		}
		
	}