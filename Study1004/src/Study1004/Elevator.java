package Study1004;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		int d = 100;

		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		// printf => 포맷에 맞는 문자를 써서 매칭되게 하는 것 
		// %d 정수형  %s 문자열		,  정수, 문자열 
 		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
		System.out.printf("%d층 -> %s 엘레베이터\n", d, guide(d));
	}

	public static String guide(int floor) {
		/* 메소드를 완성하시오. */

		
		if(1<=floor && floor<=10) {
			return "저층";
		}else if(11<= floor && floor<=20) {
			return "고층";
		}
		return "?";
		// else if 의 조건도 아니면 return 이 안넘어오니까 없으면 빨간줄 뜬다. must return
		// else 면 그 외의 경우는 다 return 이 있으니까 어쨌든 return 이 있으니까 빨간줄 안뜸 00-000
	}

}
