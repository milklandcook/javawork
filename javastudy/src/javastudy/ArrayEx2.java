package javastudy;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		//2���� �迭 ==> �迭�ȿ� �Ǵٸ� �迭
		//��, ���� ����
		//�ϴ� �迭�� �����ϸ�
		//�迭������ ������ġ��
		//���� �ٽ� ���� ���� ��ġ�� ����Ŵ
		//���� ����� ���� ���� ã�ư������� [��]�� ���� ã�ư�
		
		//2���� �迭 ����
		int score[][] = new int[2][3]; //2*3 �� 2���� �迭
		//2���� �迭�� �����ؼ� �� ����
		score[0][0] = 50; //ù��°�� ù��° �� 
		score[0][1] = 30;
		score[0][2] = 40;
		score[1][0]= 30;
		score[1][1]=40;
		score[1][2]=60;
		//int score[][]={ {50,30,40}, {30,40,60}}
		
		//�迭�� �� ���
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
			System.out.println(score[i][j]);
			}
		} // i=0, j=0 ==> score[0][0]
		  //	  j=1 ==> score[0][1]
		  //	  j=2 ==> score[0][2];
		  //i=1,  j=0 ==> score[1][2]
		
	//2�����迭�� �հ�, ��ձ��ϱ�
		int score1[][] ={ {3, 4}, {4, 4}, {4,3}, {2,3}};
		//4*2 2�����迭
		int sum=0;
		double avg=0.0;
		for(int i1=0; i1<score1.length; i1++) {
			//�迭��.length: �హ��
			for(int j1=0; j1< score1[i1].length; j1++){
				//�迭��[��].length : ���� ����
			sum += score1[i1][j1];
			}
		}
		int n=score1.length; //���� ���� ==> 4
		int m=score1[0].length;//���ǰ��� ==>2
		avg=sum/(n*m);
		System.out.println("�հ�" + sum + "���" +avg);
	}
}