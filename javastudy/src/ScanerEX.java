import java.util.Scanner;

public class ScanerEX {
    public static void main(String[] args) {

        //객체 생성
        //클래스 변수 = new 클래스 () ;
        System.out.println("숫자를 두개 입력>>");
        Scanner in = new Scanner(System.in);
        int x= in.nextInt(); //객체사용법 : 객체변수명.메소드();
        int y=in.nextInt();

        System.out.printf("%d * %d은 %d입니다", x, y, x*y);


        System.out.println("이름과 나이를 입력하세요");
        String name = in.next();
        int age=in.nextInt();
        System.out.println("당신의 이름은"+name + "나이는"+age+"입니다");
        //문제 : 직사각형의 가로
        // 세로 값을 입력받아서 넓이를 규하는 실습
        System.out.println("가로 입력"+"세로 입력");
        System.out.println("가로는"+"19"+"세로는"+"20"+"입니다");


    }
}
